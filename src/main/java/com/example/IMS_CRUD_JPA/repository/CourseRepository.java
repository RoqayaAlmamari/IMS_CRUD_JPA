package com.example.IMS_CRUD_JPA.repository;

import com.example.IMS_CRUD_JPA.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

}
