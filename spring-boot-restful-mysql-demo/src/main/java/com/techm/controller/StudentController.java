package com.techm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techm.entity.Student;
import com.techm.exceptions.StudentIdNotFoundException;
import com.techm.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController 
{
	@Autowired
    private StudentService service;
	
	@PostMapping("/student")
	public Student createStudent(@RequestBody Student student)
	{
		return service.saveStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		return service.getStudents();
	}
	
	@GetMapping("/student/{stid}")
	public Student getStudentById(@PathVariable("stid") Integer id) throws StudentIdNotFoundException
	{
		return service.getStudentById(id);
	}
	
	@PutMapping("/student/{stid}")
	public Student updateStudentById(@RequestBody Student student,@PathVariable("stid") Integer id)
	{
		Student updatedStudent = new Student();
		updatedStudent.setStname(student.getStname());
		updatedStudent.setStid(id);
		return service.saveStudent(updatedStudent);	
	}
	
	@DeleteMapping("/student/{stid}")
	public String deleteStudent(@PathVariable("stid") Integer id)
	{
		service.deleteStudentById(id);
		return "record deleted successfully";
	}
}
