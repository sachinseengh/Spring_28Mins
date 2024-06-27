package com.example.spring.jakartaCDI;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
class BusinessClass{

	Dependency1 dependency1;
	
	
		@Inject
	public void setDependency1(Dependency1 dependency) {
		this.dependency1= dependency;
		System.out.println("Dependency Injected");
	}
		
	public Dependency1 getDependency1() {
		return dependency1;
	}

	
	public String toString() {
		return "BusinessClass [dependency1=" + dependency1 +  "]";
	}

	
}



@Named
class Dependency1{
	
}

@Configuration
@ComponentScan
public class AutoWired {

	public static void main(String[] args) {
		
		var context =new AnnotationConfigApplicationContext(AutoWired.class);
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out:: println);
		
		//context.getBean(BusinessClass.class);
		System.out.println(context.getBean(BusinessClass.class).getDependency1());
		
	}

}
