package com.guruapp1.springboot.student_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = "com.guruapp1.springboot.student_service")
public class StudentServiceApplication {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(StudentServiceApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

}
