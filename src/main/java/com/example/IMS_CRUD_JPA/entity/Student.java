package com.example.IMS_CRUD_JPA.entity;

import jakarta.persistence.*;

/**
 * The Student entity class represents a student object with their basic information.
 */
@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;

	@Column(name = "first_name", nullable = false)
	public String firstName;

	@Column(name = "last_name")
	public String lastName;

	@Column(name = "email")
	public String email;

	@Column(name = "major")
	public String major;

	/**
	 * Empty constructor for the Student class.
	 */
	public Student() {

	}

	/**
	 * Constructor for the Student class.
	 * @param id the ID of the student
	 * @param firstName the first name of the student
	 * @param lastName the last name of the student
	 * @param email the email address of the student
	 * @param major the major of the student
	 */
	public Student(int id, String firstName, String lastName, String email, String major) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.major = major;
	}

	/**
	 * Returns a string representation of the Student object.
	 * @return a string representation of the Student object
	 */
	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", major='" + major + '\'' +
				'}';
	}
}
