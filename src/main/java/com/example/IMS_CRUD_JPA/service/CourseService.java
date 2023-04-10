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
    CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Optional<Course>  getSpesificCourse(int id){
        return courseRepository.findById(id);
    }

    public Course registerCourse(Course courseRegister){
        return courseRepository.save(courseRegister);
    }

    public void dropSpesificCourse(int id){
        courseRepository.deleteById(id);
    }

    public Optional<Course> updateCourse(int id, Course upToDateCourse ){
        Optional<Course> optionalCourse=courseRepository.findById(id);
        optionalCourse.ifPresent(
                (course) ->{
                    course.name=upToDateCourse.name;
                    courseRepository.save(course);
                });
        return optionalCourse;
    }

    public void deleteSpecificCourseInfo(int id) {
        courseRepository.deleteById(id);
    }
}
