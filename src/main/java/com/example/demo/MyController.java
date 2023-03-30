package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {
	
	//Burada Qualifier hangi classtan obje üretileceğini ve ioc'ye atacağını şaşırıyor 
	//Bunu bildirmek için @Qualifier kullanıyoruz.
	@Autowired
	//@Qualifier("EXEL")
	//@Qualifier("PDF")
	@Qualifier("getWordFileReader")
	private Reader reader;
	@GetMapping(path = "/read")
	public String read() {
		return this.reader.ReadFile();
	}
}
