package com.bozana.templateMethodPattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		ConcreteClass1 obj1 = (ConcreteClass1) context.getBean("obj1");
		ConcreteClass2 obj2 = (ConcreteClass2) context.getBean("obj2");
		System.out.println("----");
		obj1.templateMethod();
		System.out.println("");
		obj2.templateMethod();
	}

}
