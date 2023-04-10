package com.example.IMS_CRUD_JPA.controller;

import com.example.IMS_CRUD_JPA.entity.Teacher;
import com.example.IMS_CRUD_JPA.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeacherInfo();
    }

    @GetMapping("/{id}")
    public Optional<Teacher> getSpecificTeacher(@PathVariable int id) {
        return teacherService.getSpecificTeacherInfo(id);
    }

    @PostMapping
    public Teacher courseTeacher(@RequestBody Teacher teacher) {
        return teacherService.courseTeacher(teacher);
    }

    @PutMapping("/{id}")
    public Optional<Teacher> updateSpecificTeacherInfo(@PathVariable int id, @RequestBody Teacher upToDateTeacher) {
        return teacherService.updateSpecificTeacherInfo(id, upToDateTeacher);
    }
}
