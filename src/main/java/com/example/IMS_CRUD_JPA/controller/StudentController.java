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

	/**
	 * Retrieves a list of all students
	 * @return list of all students
	 */
	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.getAllStudentInfo();
	}

	/**
	 * Retrieves a specific student by id
	 * @param id id of the student to retrieve
	 * @return specific student by id
	 */
	@GetMapping("/{id}")
	public Optional<Student> getSpecificStudent(@PathVariable int id) {
		return studentService.getSpecificStudentInfo(id);
	}

	/**
	 * Creates a new student
	 * @param student information of the student to create
	 * @return created student information
	 */
	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return studentService.courseStudent(student);
	}

	/**
	 * Updates a specific student by id
	 * @param id id of the student to update
	 * @param updatedStudent updated information of the student
	 * @return updated student information
	 */
	@PutMapping("/{id}")
	public Optional<Student> updateSpecificStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
		return studentService.updateSpecificStudentInfo(id, updatedStudent);
	}

	/**
	 * Deletes a specific student by id
	 * @param id id of the student to delete
	 */
	@DeleteMapping("/{id}")
	public void deleteSpecificStudent(@PathVariable int id) {
		studentService.deleteSpecificStudentInfo(id);
	}
}
