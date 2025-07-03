package com.springrest.springrest.services.impl;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;


    public CourseServiceImpl() {

    }

    @Override
    public List<Course> getAllCourses() {
        return null;
    }

    @Override
    public Course getCourseByCourseId(long courseId) {

        return null;
    }

    @Override
    public Course addCourse(Course course) {

        return null;
    }

    @Override
    public Course updateCourse(Course course) {

        return null;
    }

    @Override
    public void deleteCourseByCourseId(long courseId) {

    }
}
