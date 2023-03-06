package com.example3_jdbc.dao;

import com.example3_jdbc.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**selecting all the rows*/
    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person",
                new BeanPropertyRowMapper<>(Person.class));
    }


    /**selecting a person*/
    public Person findById(int id) {
        return jdbcTemplate.queryForObject
                ("select * from person where id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(Person.class));
    }

    /**deleting a person*/
    public int deleteById(int id) {
        return jdbcTemplate.update
                ("delete * from person where id=?", id);
    }

    /**inserting a person*/
    public int insert(Person person) {
        return jdbcTemplate.update
                ("insert into person(id, name, location, birthdate)  values(?, ?, ?, ?)",
                        person.getId(), person.getName(), person.getLocation(),
                        new Timestamp(person.getBirthDate().getTime()));
    }

    /**update a person*/
    public int update(Person person) {
        return jdbcTemplate.update
                ("update person set name= ?, location= ?, birthdate= ? where id= ?",
                        person.getName(), person.getLocation(),
                        new Timestamp(person.getBirthDate().getTime()), person.getId());
    }

}
