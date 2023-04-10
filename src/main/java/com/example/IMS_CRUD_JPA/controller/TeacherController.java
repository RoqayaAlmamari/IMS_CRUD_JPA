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

    /**
     * Get a list of all teachers
     */
    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeacherInfo();
    }

    /**
     * Get a specific teacher by ID
     */
    @GetMapping("/{id}")
    public Optional<Teacher> getSpecificTeacher(@PathVariable int id) {
        return teacherService.getSpecificTeacherInfo(id);
    }

    /**
     * Create a new teacher
     */
    @PostMapping
    public Teacher courseTeacher(@RequestBody Teacher teacher) {
        return teacherService.courseTeacher(teacher);
    }

    /**
     * Update an existing teacher
     */
    @PutMapping("/{id}")
    public Optional<Teacher> updateSpecificTeacherInfo(@PathVariable int id, @RequestBody Teacher upToDateTeacher) {
        return teacherService.updateSpecificTeacherInfo(id, upToDateTeacher);
    }

    /**
     * Delete a specific teacher by ID
     */
    @DeleteMapping("/{id}")
    public void deleteSpecificTeacherInfo(@PathVariable int id) {
        teacherService.deleteSpecificTeacherInfo(id);
    }
}
