package com.archimedes.mockserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.archimedes.mockserver.mapper"})
public class MockServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockServerApplication.class, args);
	}
}
