package com.example.IMS_CRUD_JPA.service;

import com.example.IMS_CRUD_JPA.entity.Course;
import com.example.IMS_CRUD_JPA.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository; // injects the CourseRepository dependency

    // method to get all the courses
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    // method to get a specific course by id
    public Optional<Course>  getSpesificCourse(int id){
        return courseRepository.findById(id);
    }

    // method to register a new course
    public Course registerCourse(Course courseRegister){
        return courseRepository.save(courseRegister);
    }

    // method to drop a specific course by id
    public void dropSpesificCourse(int id){
        courseRepository.deleteById(id);
    }

    // method to update a course by id
    public Optional<Course> updateCourse(int id, Course upToDateCourse ){
        Optional<Course> optionalCourse=courseRepository.findById(id);
        optionalCourse.ifPresent(
                (course) ->{
                    course.name=upToDateCourse.name;
                    courseRepository.save(course);
                });
        return optionalCourse;
    }

    // method to delete specific information of a course by id
    public void deleteSpecificCourseInfo(int id) {
        courseRepository.deleteById(id);
    }
}
