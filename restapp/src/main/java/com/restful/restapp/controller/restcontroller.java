package com.restful.restapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restful.restapp.StudentDetails.StudentDetails;
import com.restful.restapp.entites.Student;
@RestController

public class restcontroller {
	@Autowired
	public StudentDetails StudentDetails;
	@GetMapping("/home")
	public String home() {
		return "You are on home page";
	}
	//get students
	@GetMapping("/Student")
    public List<Student> getStudents(){
    	return this.StudentDetails.getStudents();
    }
	// get student ny rollcall
	@GetMapping("/Student/{Studentrollcall}")
	public Student getStudent(@PathVariable String Studentrollcall) {
		return this.StudentDetails.getStudent(Long.parseLong(Studentrollcall));
	}
	//add student
	@PostMapping("/Student")
	public Student addStudent(@RequestBody Student Student) {
		return this.StudentDetails.addStudent(Student);
	}
	//update student
	@PutMapping("/Student")
	public Student updateStudent(@RequestBody  int rollcall,Student Student) {
		return this.StudentDetails.updateStudent(rollcall,Student);
	}
	//delete student
	@DeleteMapping("/Student/{Studentrollcall}")
	public Student deleteStudent(@PathVariable String Studentrollcall) {
		return this.StudentDetails.deleteStudent(Long.parseLong(Studentrollcall));
	}
}
