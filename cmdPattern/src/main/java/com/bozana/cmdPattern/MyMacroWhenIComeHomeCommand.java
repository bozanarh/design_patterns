package com.bozana.cmdPattern;

import com.bozana.cmdPattern.thirdParty.HotTub;
import com.bozana.cmdPattern.thirdParty.MusicPlayer;
import com.bozana.cmdPattern.thirdParty.RoomLight;

public class MyMacroWhenIComeHomeCommand implements Command{
	HotTub hotTub;
	MusicPlayer musicPlayer;
	RoomLight roomLight;
	
	MyMacroWhenIComeHomeCommand(HotTub hotTub, MusicPlayer musicPlayer, RoomLight roomLight){
		this.hotTub = hotTub;
		this.musicPlayer = musicPlayer;
		this.roomLight = roomLight;
	}
	public void execute() {
		//When I come home, after hard work, turn on the Light
		//turn on hot tub and start the music
		roomLight.turnOn();
		hotTub.turnOn();
		
		//play music
		musicPlayer.insertCD();
		musicPlayer.playCD();
	}

}
