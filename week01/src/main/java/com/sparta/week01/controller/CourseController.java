package com.sparta.week01.controller;

import com.sparta.week01.prac.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public Course getCourses() {
        Course course = new Course();
        course.setTitle("스프링 연습");
        course.setDays(35);
        course.setTutor("오상훈");
        return course;
    }
}