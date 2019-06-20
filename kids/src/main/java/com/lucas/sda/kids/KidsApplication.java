package com.lucas.sda.kids;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories (basePackages = "com.lucas.sda.kids.repository")
public class KidsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KidsApplication.class, args);
	}

}
