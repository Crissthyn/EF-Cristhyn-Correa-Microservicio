package pe.idat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EfCristhynCorreaMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfCristhynCorreaMicroservicioApplication.class, args);
	}

}
