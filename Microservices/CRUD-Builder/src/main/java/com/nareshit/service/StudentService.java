package com.nareshit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.dto.StudentDto;
import com.nareshit.entity.StudentDetails;
import com.nareshit.repository.StudentRepository;

import jakarta.websocket.server.ServerEndpoint;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repository;

	public String addDetails(StudentDto dto) {
		StudentDetails build = StudentDetails.builder().
		department(dto.getDepartment()).
		name(dto.getName()).
		contact(dto.getContact()).build();
		
		repository.save(build);
		return "Data added ";
	}

	public StudentDto getDetails(int stdId) {
		Optional<StudentDetails> optional = repository.findById(stdId);
		StudentDetails details = optional.get();
		StudentDto dto = StudentDto.builder().stdId(details.getStdId())
		.name(details.getName())
		.department(details.getDepartment())
		.contact(details.getContact()).build();
		return dto;
	}

	public String deleteDetails(int stdId) {
        repository.deleteById(stdId);
		return "data deleted";
	}

	public List<StudentDetails> getAllDetails() {
		 return repository.findAll();
		
	}



}
