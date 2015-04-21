package com.bozana.cmdPattern;

import com.bozana.cmdPattern.thirdParty.RoomLight;

public class RoomLightDimCommand implements Command {

	private RoomLight light;
	
	public RoomLightDimCommand(RoomLight light){
		this.light = light;
	}
	
	public void execute() {
		light.dim();
	}

}
