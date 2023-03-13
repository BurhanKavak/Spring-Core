package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context
											= new AnnotationConfigApplicationContext(IocConfig.class);
		
		CustomerDal customerDal = context.getBean("database",CustomerDal.class);
		customerDal.add();
	}

}
