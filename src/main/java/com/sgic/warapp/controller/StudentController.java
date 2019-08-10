package com.sgic.warapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.warapp.entity.Student;
import com.sgic.warapp.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/")	    
	 public String home() {
		 String saveJson = "savestudent -> /student -> {\"name\":\"John\",\"age\":23}";
		 String getJson = "getAllStudents -> /students ";
		 String display = saveJson;
	        return "Welcome to the Student Apps"+ " => " + display + " => " + getJson + " v2";
	    }
	 
	 @PostMapping("/student")
	 public Student saveStudent(@Valid @RequestBody Student student){
		 studentService.saveStudent(student);
		 return studentService.findOneStudent(student.getId());
	 }
	 
	 @GetMapping("/students")
	 public List<Student> getAllStudent(){
		 return studentService.getAllStudent();
	 }
	 
}
