package com.example.Spring_in28min.WithSpring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Spring_in28min.game.GameRunner;
import com.example.Spring_in28min.game.Gamingc;

public class AppGamingBasic {

	public static void main(String[] args) {
		
    try (var context = new AnnotationConfigApplicationContext(HelloConfig.class)) {
		////    context.getBean("name");
		//System.out.println(context.getBean("name"));
		//
		//
		//
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		    context.getBean(Gamingc.class).up();
		    context.getBean(GameRunner.class).run();
	} catch (BeansException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    	
    
   
    
	}

}
