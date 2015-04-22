package com.bozana.statePattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		StateContext stateContext = (StateContext) context.getBean("stateContext");
		stateContext.setCurrentState(StateConstants.STATE1);
		stateContext.aFunc();
		stateContext.cFunc();
		stateContext.aFunc();

	}

}
