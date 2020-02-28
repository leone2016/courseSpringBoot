package com.formacionbdi.microservicios.app.examenes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class UsrvExamenesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsrvExamenesApplication.class, args);
	}

}
