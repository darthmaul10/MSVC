package com.ashonplafa.activoFijo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicioActivoFijoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioActivoFijoApplication.class, args);
	}

}
