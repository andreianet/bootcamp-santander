package com.andreia.bootcampsantander;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BootcampsantanderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampsantanderApplication.class, args);
	}

	@Bean
	//Testar: http://localhost:8080/bootcampsantander/swagger-ui.html //
	public OpenAPI customOpenAPI(){
		return new OpenAPI().info(new Info()
				.title("")
				.version("1.0")
				.termsOfService("http://swagger.io/terms")
				.license(new License().name("Apache 2.0").url("http://spring.org")));
	}

}
