package com.example.IMS_CRUD_JPA.controller;

import com.example.IMS_CRUD_JPA.entity.Course;
import com.example.IMS_CRUD_JPA.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/courses")
public class CourseController {
    @Autowired
    CourseService courseService;

    /** Returns a list of all courses **/
    @GetMapping
    public List<Course> getAllCourse(){
        return courseService.getAllCourses();
    }

    /** Returns a specific course by ID **/
    @GetMapping("/{id}")
    public Optional<Course> getSpesificCourse(@PathVariable int id){
        return courseService.getSpesificCourse(id);
    }

    /** Creates a new course **/
    @PostMapping
    public  Course createCourse(@RequestBody Course courseCreate){
        return courseService.registerCourse(courseCreate);
    }

    /** Updates an existing course by ID **/
    @PutMapping("/{id}")
    public  Optional<Course> updateCourse(@PathVariable int id, @RequestBody Course upToDatecourse ){
        return courseService.updateCourse(id, upToDatecourse);
    }

    /** Deletes a specific course by ID **/
    @DeleteMapping(path = "/{id}")
    public void deleteSpesificCourse(@PathVariable int id){
        courseService.dropSpesificCourse(id);
    }
}
