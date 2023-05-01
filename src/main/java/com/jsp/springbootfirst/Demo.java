package com.jsp.springbootfirst;

import java.awt.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
//	@Autowired
//	Student student;

	@RequestMapping("/test")
	public String test() {
		return "welcome to Spring boot application";
	}

	@GetMapping("/test2")
	public String test2() {
		return "Hello";
	}

	@GetMapping("/test3")
	public LocalDateTime test3() {
		return LocalDateTime.now();
	}

	@GetMapping("/test4")
	public Student test4() {
		Student student = new Student();

		student.setId(0);
		student.setName("Ranu Mandal");
		student.setAge(45);
		return student;
	}

	@GetMapping("/test5")
	public ArrayList<Student> test5() {
		ArrayList<Student> l = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setId(0);
		s1.setName("Ranu Mandal");
		s1.setAge(45);
		l.add(s1);

		Student s2 = new Student();
		s2.setId(1);
		s2.setName("Pravas");
		s2.setAge(35);
		l.add(s2);

		Student s3 = new Student();
		s3.setId(2);
		s3.setName("Revi");
		s3.setAge(25);

		l.add(s3);
		return l;
	}
	@PostMapping("/test6")
	public Student loadStudent(@RequestBody Student student) {
		
		if (student!=null) {
			return	student;			
		}
		return null;
		
	}
}
