package com.clientegeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages="com.clientegeo.entity")
public class ClienteGeoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteGeoApplication.class, args);
	}

}

