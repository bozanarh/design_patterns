package com.bozana.strategyPattern;

public abstract class Character {
	protected Weapon myWeapon;
	
	abstract void fight();

	public Weapon getMyWeapon() {
		return myWeapon;
	}

	public void setMyWeapon(Weapon myWeapon) {
		this.myWeapon = myWeapon;
	}
}
