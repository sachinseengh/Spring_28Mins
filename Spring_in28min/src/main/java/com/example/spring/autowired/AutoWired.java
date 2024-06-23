package com.example.spring.autowired;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessClass{
	
	//This is field injection
	//@Autowired
	Dependency1 dependency1;
	
	//@Autowired
		Dependency2 dependency2;
		
	
		
	public Dependency1 getDependency1() {
		return dependency1;
	}

	
	//This is Setter injection
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		this.dependency1 = dependency1;
//	}
//
//
//	public Dependency2 getDependency2() {
//		return dependency2;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//	}


	
	
	public String toString() {
		return "BusinessClass [dependency1=" + dependency1 + ", dependency2=" + dependency2 + "]";
	}

//This is constructor injection and it is not mandatory to write @Autowired 
	//it is recommended because it initialize all at once
	public BusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	
	
	
	
}

@Component
class Dependency2{
	
}

@Component
class Dependency1{
	
}

@Configuration
@ComponentScan
public class AutoWired {

	public static void main(String[] args) {
		
		var context =new AnnotationConfigApplicationContext(AutoWired.class);
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out:: println);
		
		//context.getBean(BusinessClass.class);
		System.out.println(context.getBean(BusinessClass.class));
		
	}

}
