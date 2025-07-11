package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getAllCourses();

    public Course getCourseByCourseId(Long courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public void deleteCourseByCourseId(Long courseId);
}
