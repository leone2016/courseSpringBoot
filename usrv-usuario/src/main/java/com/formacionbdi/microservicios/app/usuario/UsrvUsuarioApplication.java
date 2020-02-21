package com.formacionbdi.microservicios.app.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class UsrvUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsrvUsuarioApplication.class, args);
	}

}
