package com.example3_jdbc;

import com.example3_jdbc.dao.PersonJdbcDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	}
}
