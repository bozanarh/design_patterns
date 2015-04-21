package com.bozana.strategyPattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		King king = (King) context.getBean("king");
		king.fight();
		
		Troll troll = (Troll)context.getBean("troll");
		troll.fight();
		
		Knight knight = (Knight)context.getBean("knight");
		knight.fight();
	}

}
