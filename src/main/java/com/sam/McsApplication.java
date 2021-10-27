package com.sam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class McsApplication {

	public static void main(String[] args) {
		SpringApplication.run(McsApplication.class, args);
	}

}
