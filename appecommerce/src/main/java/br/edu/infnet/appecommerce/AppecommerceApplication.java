package br.edu.infnet.appecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppecommerceApplication {

	public static void main(String[] args) {

		SpringApplication.run(AppecommerceApplication.class, args);
	}

}
