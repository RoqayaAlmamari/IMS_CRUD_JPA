package com.example.IMS_CRUD_JPA.controller;

import com.example.IMS_CRUD_JPA.entity.Course;
import com.example.IMS_CRUD_JPA.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/course")
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping
    public List<Course> getAllCourse(){
        return courseService.getAllCourses();
    }

    @GetMapping
    public Optional<Course> getSpesificCourse(@PathVariable int id){
        return courseService.getSpesificCourse(id);
    }

    @PostMapping
    public  Course createCourse(@RequestBody Course courseCreate){
        return courseService.registerCourse(courseCreate);
    }

    @PutMapping
    public  Optional<Course> updateCourse(@PathVariable int id, @RequestBody Course upToDatecourse ){
        return courseService.updateCourse(id, upToDatecourse);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteSpesificCourse(@PathVariable int id){
        courseService.dropSpesificCourse(id);
    }
}
