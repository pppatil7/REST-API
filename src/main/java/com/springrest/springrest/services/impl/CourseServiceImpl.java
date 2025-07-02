package com.springrest.springrest.services.impl;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> courseList;

    public CourseServiceImpl() {
        courseList = new ArrayList<>();
        courseList.add(new Course(1212, "Java", "Beginner Java Course"));
        courseList.add(new Course(3233, "SpringBoot", "REST API creating using SpringBoot"));
    }

    @Override
    public List<Course> getAllCourses() {
        return courseList;
    }
}
