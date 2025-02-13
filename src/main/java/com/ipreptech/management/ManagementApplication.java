package com.ipreptech.management;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class ManagementApplication {

	public static void main(String[] args) {
		log.error("Hello we just started the server");
		SpringApplication.run(ManagementApplication.class, args);
	}
}
