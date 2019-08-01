package com.sgic.warapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.warapp.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{
	public Student findStudentById(Long id);
}
