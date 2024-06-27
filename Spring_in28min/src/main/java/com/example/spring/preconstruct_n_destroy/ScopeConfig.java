package com.example.spring.preconstruct_n_destroy;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.spring.lazy.Lazyinitialization;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;



@Component
class Prototype{
	
	Dependency dependency;
	public Prototype(Dependency dependency) {
		super();
		this.dependency= dependency;
		System.out.println("Object initiated");
	}
	

	//post construct method run automaticallly after the object is initialized
	//using dependency injection
	@PostConstruct
	public  void afterInitialization() {
		dependency.getReady();
	}
	
	//This runs when the bean is removed from the application context
	@PreDestroy
	public void clean() {
		System.out.println("Clean Up");
	}
	
	
}

@Component
class Dependency{
	
	public void getReady() {
		System.out.println("I come after initialization");
	}
}



@Configuration
@ComponentScan

public class ScopeConfig {
	public static void main(String[] args) {
	 var context = new AnnotationConfigApplicationContext(ScopeConfig.class);
	 
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out:: println);

	 
	 
	}
}
