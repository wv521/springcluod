package com.ww;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableFeignClients(clients = {FeignService.class},basePackages = "com.ww.service")
public class SpringcloudConsumerApplication {

	@Value("${name}")
	private List<Integer> ids =  new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsumerApplication.class, args);
	}

}
