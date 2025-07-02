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

    @Override
    public Course getCourseByCourseId(long courseId) {
        Course resultCourse = null;
        for (Course course : courseList) {
            if (course.getCourseId() == courseId) {
                resultCourse = course;
                break;
            }
        }
        return resultCourse;
    }

    @Override
    public Course addCourse(Course course) {
        courseList.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        long courseId = course.getCourseId();
        for (Course tempCourse : courseList) {
            if (tempCourse.getCourseId() == courseId) {
                courseList.remove(tempCourse);
                courseList.add(course);
                break;
            }
        }
        return course;
    }
}
