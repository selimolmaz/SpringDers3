package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("PDF")
@Primary
//sadece bir class primary olabilir
public class PdfFileReader implements Reader{

	@Override
	public String ReadFile() {
		return "PDF file!";
	}

}
