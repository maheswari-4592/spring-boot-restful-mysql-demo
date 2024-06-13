package com.techm.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techm.model.Student;

@RestController
@RequestMapping("/api")
public class StudentController {

	@GetMapping("/student")
	public String welcome() 
	{
		return "welcome to springboot restfull webservice";
	}
	
	@PostMapping("/createStudent")
	public Student createStudent(@RequestBody Student student)
	{
		return student;
	}
	
	@GetMapping("/student/{stid}/{stname}")
	public Student getStudentByIdAndName(@PathVariable("stid") Integer x,@PathVariable("stname") String y)	
	{
		return new Student(x,y);
	}
	
	@PutMapping("/student/{stid}")
	public Student updateStudentById(@RequestBody Student student, @PathVariable("stid") Integer x)
	{
		
		return new Student(x, student.getStname());
	}
	
	@DeleteMapping("/student/{stid}")
	public String deleteStudentById(@PathVariable("stid") Integer x)
	{
		return x + "th record deleted ";
	}
	
	@GetMapping("/students")
	public List<Student> getListOfStudents()
	{
		List<Student> lists = new ArrayList<>();
		Student s1 = new Student(100,"shiva");
		Student s2 = new Student(101,"teja");
		lists.add(s1);
		lists.add(s2);
		return lists;
	}
	
}
