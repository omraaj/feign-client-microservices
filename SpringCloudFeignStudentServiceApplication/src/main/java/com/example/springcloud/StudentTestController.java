package com.example.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentTestController {

	
	@Autowired
	private BookRestConsumer consumer;
	
	
	@GetMapping("/data")
	public String getStudentInfo() {
		System.out.println(consumer.getClass().getName());
		return "Accessing from STUDENT-SERVICE "+consumer.getBookData();
	}
	
	@GetMapping("/allbooks")
	public String getBooksinfo() {
		return "Accesing from STUDENT_SERVICE"+consumer.getAllBooks();
	}
	
	@GetMapping("/getBook/{id}")
	public String getBookbyId(@PathVariable Integer id) {
		return "Accesing from STUDENT_SERVICE"+consumer.getBookById(id);
	}
	
	@GetMapping("/entity")
	public String printEntityData() {
		ResponseEntity<String> resp = consumer.getEntityData();
		return "Accessing from STUDENT_SERVICE"+resp.getBody()+", status is :"+ resp.getStatusCode();
	}
	
}
