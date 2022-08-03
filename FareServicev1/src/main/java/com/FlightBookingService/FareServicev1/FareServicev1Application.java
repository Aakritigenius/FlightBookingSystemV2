package com.FlightBookingService.FareServicev1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class FareServicev1Application {

	public static void main(String[] args) {
		SpringApplication.run(FareServicev1Application.class, args);
	}

}
