package com.bozana.cmdPattern;

import com.bozana.cmdPattern.thirdParty.MusicPlayer;

public class MusicPlayerOnCommand implements Command {
	private MusicPlayer musicPlayer;
	
	public MusicPlayerOnCommand( MusicPlayer musicPlayer){
		this.musicPlayer = musicPlayer;
	}
	public void execute() {
		musicPlayer.insertCD();
		musicPlayer.playCD();
	}

}
