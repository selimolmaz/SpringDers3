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
	//@Qualifier("EXEL")
	//@Qualifier("PDF")
	//@Qualifier("getWordFileReader")
	// Son olarak ise PDF class'ı için primary annotation ekledik ve 
	// herhangi bir belirteç olmadan böyle bir durumda kullanılırsa default olarak kullanmasını istedik!
	
	@Autowired
	private Reader reader;
	
	@Autowired
	@Qualifier("getWordFileReader")
	private Reader reader2;
	
	@GetMapping(path = "/read")
	public String read() {
		return this.reader.ReadFile() + " - " + this.reader2.ReadFile();
	}
}
