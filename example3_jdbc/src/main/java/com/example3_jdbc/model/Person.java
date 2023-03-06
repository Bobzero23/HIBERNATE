package com.example3_jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private  int id;
    private String name;
    private String location;
    private Date birthDate;

}
