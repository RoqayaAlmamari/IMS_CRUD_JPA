package com.example.IMS_CRUD_JPA.service;

import com.example.IMS_CRUD_JPA.entity.Student;
import com.example.IMS_CRUD_JPA.repository.StudentRepository;
import com.example.IMS_CRUD_JPA.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Retrieves a specific student by ID
    public Optional<Student> getSpecificStudentInfo(int id) {
        return studentRepository.findById(id);
    }

    // Retrieves all students
    public List<Student> getAllStudentInfo() {
        return studentRepository.findAll();
    }

    // Saves a new student to the database
    public Student courseStudent(Student student) {
        return studentRepository.save(student);
    }

    // Updates an existing student's information
    public Optional<Student> updateSpecificStudentInfo(int id, Student upToDateTeacher) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        optionalStudent.ifPresent(
                (teacher) -> {
                    teacher.firstName = upToDateTeacher.firstName;
                    teacher.lastName = upToDateTeacher.lastName;
                    teacher.email = upToDateTeacher.email;
                    teacher.major = upToDateTeacher.major;
                    studentRepository.save(teacher);
                }
        );
        return optionalStudent;
    }

    // Deletes a specific student by ID
    public void deleteSpecificStudentInfo(int id) {
        studentRepository.deleteById(id);
    }
}
