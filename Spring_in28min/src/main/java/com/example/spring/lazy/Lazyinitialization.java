package com.example.spring.lazy;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class A{
	
}


@Component
//it will not initialized until the class B is used
//so it is lazy it will not move until we ask it to 
@Lazy
class B{
	private A  ClassA;
	public B(A classa) {
		System.out.println("class b initialized");
		this.ClassA = classa;
	}
	public void check() {
		System.out.println("Now it is invoked");
	}
}


@Configuration
@ComponentScan

public class Lazyinitialization {

	public static void main(String[] args) {
		

		var context = new AnnotationConfigApplicationContext(Lazyinitialization.class);
		
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out:: println);
		
		context.getBean(B.class).check();
	}

}
