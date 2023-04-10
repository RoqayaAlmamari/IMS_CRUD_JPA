package com.example.IMS_CRUD_JPA.repository;

import com.example.IMS_CRUD_JPA.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

}
