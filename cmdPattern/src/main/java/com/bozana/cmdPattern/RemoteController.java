package com.bozana.cmdPattern;

import java.util.HashMap;
import java.util.Map;

public class RemoteController {
	private Map<Integer, Command> buttons = new HashMap<Integer, Command>();
	
	public RemoteController(){
	}

	public void setCommand(Integer id, Command cmd){
		buttons.put(id, cmd);
	}
	
	public void pressOnButton( Integer buttonId ){
		Command cmd = buttons.get(buttonId);
		cmd.execute();
	}
}
