package com.example.IMS_CRUD_JPA.service;

import com.example.IMS_CRUD_JPA.entity.Teacher;
import com.example.IMS_CRUD_JPA.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    // Get specific teacher information by id
    public Optional<Teacher> getSpecificTeacherInfo(int id) {
        return teacherRepository.findById(id);
    }

    // Get all teacher information
    public List<Teacher> getAllTeacherInfo() {
        return teacherRepository.findAll();
    }

    // Create a new teacher
    public Teacher courseTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    // Update specific teacher information by id
    public Optional<Teacher> updateSpecificTeacherInfo(int id, Teacher upToDateTeacher) {
        Optional<Teacher> optionalTeacher = teacherRepository.findById(id);
        optionalTeacher.ifPresent(
                (teacher) -> {
                    teacher.firstName = upToDateTeacher.firstName;
                    teacher.lastName = upToDateTeacher.lastName;
                    teacher.email = upToDateTeacher.email;
                    teacher.course = upToDateTeacher.course;
                    teacherRepository.save(teacher);
                }
        );
        return optionalTeacher;
    }

    // Delete specific teacher information by id
    public void deleteSpecificTeacherInfo(int id) {
        teacherRepository.deleteById(id);
    }
}
