package com.luv2code.springdemo;

import javax.naming.ContextNotEmptyException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		// load the spring config file 
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from container
		Coach theCoach= context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach= context.getBean("tennisCoach",Coach.class);
		boolean result=(theCoach==alphaCoach);
		// print out the result
		System.out.println("\n Pointing to the same object :"+result);
		System.out.println("\nMemory location for theCoach: "+ theCoach);
		System.out.println("\nMemory location for alphaCoach: "+alphaCoach);
		
		//close the context
		context.close();	
	}
}
