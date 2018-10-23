package com.example.jianshuapi;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2Doc
public class JianshuApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JianshuApiApplication.class, args);
	}
}
