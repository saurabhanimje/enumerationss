package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.StudentRepository;
import com.cjc.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository sr;

	@Override

	public Student postStudentData(Student student) {
	
		return sr.save(student);
	}

	
}
