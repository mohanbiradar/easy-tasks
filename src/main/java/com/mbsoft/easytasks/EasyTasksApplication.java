package com.mbsoft.easytasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EasyTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyTasksApplication.class, args);
	}
}
