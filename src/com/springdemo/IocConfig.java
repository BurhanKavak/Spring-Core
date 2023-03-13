package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springdemo")
public class IocConfig {
	
	@Bean
	public CustomerDal database() {
		return new MySqlCustomerDalImpl();
	}
}
