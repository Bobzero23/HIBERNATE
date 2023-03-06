package com.example1.example1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {
    private long id;
    private String name;
    private String author;
}
