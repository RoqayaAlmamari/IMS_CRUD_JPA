package com.example.IMS_CRUD_JPA.repository;

import com.example.IMS_CRUD_JPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository< Student, Integer>{

}
