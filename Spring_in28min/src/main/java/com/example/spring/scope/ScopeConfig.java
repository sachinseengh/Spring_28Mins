package com.example.spring.scope;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.spring.lazy.Lazyinitialization;

@Component
class Example{
	
}

@Component
//The default scope is singleton so the same instance of object will be used no matter 
//how many time we call it
//prototype make different instance of bean each time everytime we call it
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Prototype{
	
}




@Configuration
@ComponentScan

public class ScopeConfig {
	public static void main(String[] args) {
	 var context = new AnnotationConfigApplicationContext(ScopeConfig.class);
	 
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out:: println);
	 System.out.println(context.getBean(Prototype.class));
	 System.out.println(context.getBean(Prototype.class));
	 System.out.println(context.getBean(Prototype.class));
	 
	 System.out.println(context.getBean(Example.class));
	 System.out.println(context.getBean(Example.class));
	 
	 
	}
}
