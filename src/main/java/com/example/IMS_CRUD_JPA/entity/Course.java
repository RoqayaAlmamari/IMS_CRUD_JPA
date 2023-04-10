package com.example.IMS_CRUD_JPA.entity;

import jakarta.persistence.*;

@Entity // This annotation indicates that this class is a JPA entity
public class Course {

    @Id // This annotation indicates that this field is the primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This annotation indicates that the primary key should be generated automatically
    @Column // This annotation indicates that this field maps to a database column
    public int id;

    @Column // This annotation indicates that this field maps to a database column
    public String name;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
