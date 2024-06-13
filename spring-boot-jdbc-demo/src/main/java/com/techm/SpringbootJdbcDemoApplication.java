package com.techm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.techm.model.Student;
import com.techm.repository.StudentDao;

@SpringBootApplication
public class SpringbootJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootJdbcDemoApplication.class, args);
		
		StudentDao dao = context.getBean(StudentDao.class);
	
	    int x = dao.saveStudent();
	    System.out.println(x + "row(s) inserted");
	}

}