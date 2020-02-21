package com.formacionbdi.microservicios.app.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class UsrvEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsrvEurekaApplication.class, args);
	}

}
