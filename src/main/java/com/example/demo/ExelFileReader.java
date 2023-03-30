package com.example.demo;

import org.springframework.stereotype.Component;

@Component("EXEL")
public class ExelFileReader implements Reader{

	@Override
	public String ReadFile() {
		return "Exel file!";
	}
	
}
