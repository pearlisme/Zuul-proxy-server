package com.pearl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pearl.filter.AddRequestHeaderFilter;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
@Configuration
@RestController
public class ZuulProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulProxyApplication.class, args);
	}
	
	
	@Bean
	public AddRequestHeaderFilter addRequestHeaderFilter() {
		
		return new AddRequestHeaderFilter();
	}
	
//	@GetMapping
//	public String sayHello() {
//		return "Welcome to ZUUL PROXY";
//	}
}
