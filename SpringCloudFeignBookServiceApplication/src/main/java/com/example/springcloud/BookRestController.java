package com.example.springcloud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookRestController {

	@Autowired
	Environment environment;
	
	
	@GetMapping("/data")
	public String getBookData() {
		return "data of BOOK_SERVICE running on port : " + environment.getProperty("local.server.port");
	}
	
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable Integer id) {
		return new Book(id,"Sherlock Holmes",500.75);
	}
	
	@GetMapping("/all")
	public List<Book> getAll(){
		return List.of(
				new Book(501,"Sherlock Holmes",500.75),
				new Book(502,"Spring",3000.34),
				new Book(503,"Distributed Systemn",1999.32)
				);
	}
	@GetMapping("entity")
	public ResponseEntity<String> getEntityData(){
		return new ResponseEntity<String>("Hello This Is BookREstController: ",HttpStatus.OK);
	}
}
