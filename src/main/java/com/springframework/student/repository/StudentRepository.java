package com.springframework.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springframework.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
