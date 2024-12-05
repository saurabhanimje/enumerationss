package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController 
{

	@Autowired
	StudentService ss;
	
	@PostMapping("/post")
	public ResponseEntity<Student> postData(@RequestBody Student student)
	{
		Student data=ss.postStudentData(student);
		return new ResponseEntity<Student>(data,HttpStatus.CREATED);
	}
}
