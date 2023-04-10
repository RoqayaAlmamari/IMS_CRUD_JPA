package com.example.IMS_CRUD_JPA.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "teacher")
public class Teacher {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public int id;

        @Column(name = "first_name", nullable = false)
        public String firstName;

        @Column(name = "last_name")
        public String lastName;

        @Column(name = "email")
        public String email;

        @Column(name = "course")
        public String course;


    public Teacher(int id, String firstName, String lastName, String email, String course) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.course = course;
    }

    @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", email='" + email + '\'' +
                    ", course='" + course + '\'' +
                    '}';
        }
    }

