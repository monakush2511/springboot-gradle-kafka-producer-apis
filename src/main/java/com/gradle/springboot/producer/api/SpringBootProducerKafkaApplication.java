package com.gradle.springboot.producer.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringBootProducerKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProducerKafkaApplication.class, args);
	}

}
