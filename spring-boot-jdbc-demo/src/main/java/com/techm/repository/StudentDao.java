package com.techm.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techm.model.Student;

@Repository("dao")
public class StudentDao {

	@Autowired
	private JdbcTemplate template;
	
	public int saveStudent() {
		
	return template.update("insert into student values(101,'maheswari')");
	
		
	}

	
	
}