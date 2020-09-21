package com.ww;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
//@MapperScan("com.ww.dao")
public class SpringcloudProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudProducerApplication.class, args);
	}

}
