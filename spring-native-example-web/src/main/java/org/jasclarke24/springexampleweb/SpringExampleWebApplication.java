package org.jasclarke24.springexampleweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringExampleWebApplication {

	@RequestMapping("/")
	String home() {
		return "Hello from Spring-Example-Web (uses spring-boot-parent)";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleWebApplication.class, args);
	}

}
