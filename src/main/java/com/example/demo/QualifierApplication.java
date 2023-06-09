package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QualifierApplication {

	public static void main(String[] args) {
		SpringApplication.run(QualifierApplication.class, args);
	}
	
	//Bean ile bizim olmayan classları da ioc'ye eklemek için yapıldı!
	//@Primary annotation buraya da eklenebilir!
	@Bean()
	public WordFileReader getWordFileReader() {
		return new WordFileReader();
	}
}
