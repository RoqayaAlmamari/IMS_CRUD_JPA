package com.example.IMS_CRUD_JPA.controller;

import com.example.IMS_CRUD_JPA.entity.Teacher;
import com.example.IMS_CRUD_JPA.repository.TeacherRepository;
import com.example.IMS_CRUD_JPA.service.TeacherService;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public class TeacherController {
    @Autowired
    TeacherService teacherservice;

    @GetMapping
    public List<Teacher> getAllTeacher(){
        return teacherservice.getAllTeacherInfo();
    }

    @GetMapping(path="/{id}")
    public Optional<Teacher> getSpecificTeacher(@PathVariable int id){
        return teacherservice.getSpecificTeacher(id);
    }

    public List<Teacher> getAllTeacherInfo(){
        return TeacherRepository.finadAll();
    }

    public Teacher courseTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }

    public Optional<Teacher> updateSpecificTeacherInfo(int id, Teacher upToDateTeacher){
        Optional<Teacher> foundTeacher= getSpecificTeacher(id);
        foundTeacher.ifPresent(
                (currTeacher)->{
                    currTeacher
                }
        );
    }
}
