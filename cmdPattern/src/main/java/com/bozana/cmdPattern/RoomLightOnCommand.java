package com.bozana.cmdPattern;

import com.bozana.cmdPattern.thirdParty.RoomLight;

public class RoomLightOnCommand implements Command {
	private RoomLight roomLight;
	
	public RoomLightOnCommand(RoomLight roomLight){
		this.roomLight = roomLight;
	}
	
	public void execute() {
		roomLight.turnOn();
	}

}
