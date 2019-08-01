package com.sgic.warapp;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.warapp.entity.Student;
import com.sgic.warapp.service.StudentService;

@RestController
@SpringBootApplication
public class SpringAppWarApplication extends SpringBootServletInitializer{
	
	@Autowired
	private StudentService studentService;

	 @RequestMapping("/")	    
	 public String home() {
		 String saveJson = "savestudent -> /student -> {\"name\":\"John\",\"age\":23}";
		 String getJson = "getAllStudents -> /students ";
		 String display = saveJson;
	        return "Welcome to the Student App"+ " => " + display + " => " + getJson;
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
	 
	public static void main(String[] args) {
		SpringApplication.run(SpringAppWarApplication.class, args);
	}

}
