package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home() {
        return "this is home page";
    }

    //Get the courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return this.courseService.getAllCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourseByCourseId(@PathVariable Long courseId) {
        return this.courseService.getCourseByCourseId(courseId);
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourseByCourseId(@PathVariable Long courseId) {
        this.courseService.deleteCourseByCourseId(courseId);
        return ResponseEntity.noContent().build();
    }
}
