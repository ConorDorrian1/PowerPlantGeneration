package com.masters.generation.plantgeneration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages={"com.masters.generation.plantgeneration.Controller"}) //From package above, so that controller can see and access this file
@EnableEurekaClient
public class PlantGenerationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantGenerationApplication.class, args);
	}

}
