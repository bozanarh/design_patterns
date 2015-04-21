package com.bozana.cmdPattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		RemoteController remoteController = (RemoteController) context.getBean("remoteController");
		
		//button1 - doing "whenIComeHome" command
		MyMacroWhenIComeHomeCommand whenIComeHome = 
				(MyMacroWhenIComeHomeCommand)context.getBean("whenIComeHomeCommand");
		remoteController.setCommand(1, whenIComeHome);
		
		//TODO: button2 - turning off "whenIComeHome"
		
		//button3 - turning on light
		RoomLightOnCommand lightOnCmd = (RoomLightOnCommand) context.getBean("roomLightOnCommand");
		remoteController.setCommand(2,lightOnCmd);
		
		//simulate, I pressed button1
		remoteController.pressOnButton(1);
		
		//simulate, I pressed button3
		//remoteController.pressOnButton(3);
	}

}
