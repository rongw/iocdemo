package com.demo.ioc.experiment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Boot {
	
	public static void main(String []args){
		
		  ApplicationContext context =  new AnnotationConfigApplicationContext(Application.class);
		  Application app = context.getBean(Application.class);
		  app.start();
		  
	}
}
