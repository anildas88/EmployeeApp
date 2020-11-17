package com.qb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qb.repository")
public class EmployeeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAppApplication.class, args);
	}

}
