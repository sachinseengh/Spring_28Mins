package com.example.spring.exercise1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;



public class Business {

	public static void main(String[] args) {
	
		
		var context=
				new AnnotationConfigApplicationContext(BusinessCalculationService.class);
		
		
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out:: println);
		
		System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		
		

	}

}
