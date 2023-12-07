package com.nareshit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nareshit.entity.StudentDetails;

public interface StudentRepository extends JpaRepository<StudentDetails, Integer> {

}
