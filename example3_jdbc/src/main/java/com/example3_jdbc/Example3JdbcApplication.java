package com.example3_jdbc;

import com.example3_jdbc.dao.PersonJdbcDao;
import com.example3_jdbc.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@Slf4j
@SpringBootApplication
public class Example3JdbcApplication implements CommandLineRunner {

	@Autowired
	PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(Example3JdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("All users -> {}", personJdbcDao.findAll());
		log.info("User id -> 10001 {}", personJdbcDao.findById(10001));
		log.info("Deleting 10004 -> No of rows deleted {} ", personJdbcDao.findById(10004));
		log.info("inserting 10006 -> {} ", personJdbcDao.insert(new Person(10006, "Amda", "Temeke", new Date())));
		/**here is another code for updating a person if you wanna implement it**/
	}
}
