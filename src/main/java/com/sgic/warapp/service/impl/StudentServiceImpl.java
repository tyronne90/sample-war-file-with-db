package com.sgic.warapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.warapp.entity.Student;
import com.sgic.warapp.repo.StudentRepo;
import com.sgic.warapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepo studentRepo;
	
	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student findOneStudent(Long id) {
		return studentRepo.findStudentById(id);
	}

}
