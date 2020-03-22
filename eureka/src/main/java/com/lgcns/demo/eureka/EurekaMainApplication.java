package com.lgcns.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaMainApplication {

	public static void main(String[] args) {
		System.out.println("@@@@@ start log......");
		SpringApplication.run(EurekaMainApplication.class, args);
	}

}
