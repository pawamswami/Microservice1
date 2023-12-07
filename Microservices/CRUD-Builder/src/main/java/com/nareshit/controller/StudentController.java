package com.nareshit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.dto.StudentDto;
import com.nareshit.entity.StudentDetails;
import com.nareshit.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("/add")
	public String addDetails(@RequestBody StudentDto dto) {
		return service.addDetails(dto);

	}

	@GetMapping("/get/{stdId}")
	public StudentDto getDetails(@PathVariable int stdId) {
		return service.getDetails(stdId);
	}

	@DeleteMapping("/delete/{stdId}")
	public String deleteDetails(@PathVariable int stdId) {
		return service.deleteDetails(stdId);
	}

	@GetMapping("/getall")
	public List<StudentDetails> getAllDetails() {
		return service.getAllDetails();
	}

	@PutMapping("/update/{stdId}")
	public String updateDetails(@PathVariable int stdId, @RequestBody StudentDto dto) {
       return service.updateDetails(stdId,dto);
	}

}
