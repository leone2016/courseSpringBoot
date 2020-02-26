package com.formacionbdi.microservicios.app.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.formacionbdi.microservicios.common.alumnos.models.entity"})
public class UsrvUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsrvUsuarioApplication.class, args);
	}

}
