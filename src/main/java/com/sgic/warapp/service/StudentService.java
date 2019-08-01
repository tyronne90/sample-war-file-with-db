package com.sgic.warapp.service;

import java.util.List;

import com.sgic.warapp.entity.Student;

public interface StudentService {
	
	public List<Student> getAllStudent();
	public Student saveStudent(Student student);
	public Student findOneStudent(Long id);
	
}
