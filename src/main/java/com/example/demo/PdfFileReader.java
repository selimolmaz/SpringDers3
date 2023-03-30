package com.example.demo;

import org.springframework.stereotype.Component;

@Component("PDF")
public class PdfFileReader implements Reader{

	@Override
	public String ReadFile() {
		return "PDF file!";
	}

}
