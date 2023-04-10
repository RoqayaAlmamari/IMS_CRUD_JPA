package com.example.IMS_CRUD_JPA.controller;

import com.example.IMS_CRUD_JPA.entity.Student;
import com.example.IMS_CRUD_JPA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.getAllStudentInfo();
	}

	@GetMapping("/{id}")
	public Optional<Student> getSpecificStudent(@PathVariable int id) {
		return studentService.getSpecificStudentInfo(id);
	}

	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return studentService.courseStudent(student);
	}

	@PutMapping("/{id}")
	public Optional<Student> updateSpecificStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
		return studentService.updateSpecificStudentInfo(id, updatedStudent);
	}

	@DeleteMapping("/{id}")
	public void deleteSpecificStudent(@PathVariable int id) {
		studentService.deleteSpecificStudentInfo(id);
	}
}
