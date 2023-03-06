package com.example1.example1.controller;

import com.example1.example1.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn Aws", "In 28 minutes"),
                new Course(2, "Learn DevOps", "In 28 minutes")
        );
    }
}
