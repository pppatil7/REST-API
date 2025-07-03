package com.springrest.springrest.services.impl;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import com.springrest.springrest.exceptions.ResourceNotFoundException;
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
        return courseDao.findAll();
    }

    @Override
    public Course getCourseByCourseId(Long courseId) {
        return courseDao.findById(courseId).orElseThrow(() -> new ResourceNotFoundException("Course Not Found with ID: " + courseId));
    }

    @Override
    public Course addCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public void deleteCourseByCourseId(Long courseId) {
        courseDao.deleteById(courseId);
    }
}
