package com.microservicios.app.futfem.teams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviciosFutfemTeamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosFutfemTeamsApplication.class, args);
	}

}
