package com.bozana.cmdPattern;

import com.bozana.cmdPattern.thirdParty.HotTub;

public class HotTubOnCommand implements Command {

	HotTub hotTub;
	
	public HotTubOnCommand( HotTub hotTub){
		this.hotTub = hotTub;
	}
	
	public void execute() {
		hotTub.turnOn();
	}

}
