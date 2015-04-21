package com.bozana.cmdPattern;

import com.bozana.cmdPattern.thirdParty.RoomLight;

public class RoomLightOffCommand implements Command {
	private RoomLight light;

	public RoomLightOffCommand(RoomLight light){
		this.light = light;
	}
	
	public void execute() {
		light.turnOff();
	}

}
