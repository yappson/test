package com.bezkoder.spring.jpa.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootJpaH2Application extends SpringBootServletInitializer {
// hello 123 pushs testkasjdnkjsandkjaskjsandkjasnkjdsnbhsagvdfgjasvdjhgdfvjhasdgvdsjbjkdsabkjbaskjb
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBootJpaH2Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaH2Application.class, args);
	}

}
