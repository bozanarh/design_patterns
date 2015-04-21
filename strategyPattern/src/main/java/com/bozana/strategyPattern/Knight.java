package com.bozana.strategyPattern;

public class Knight extends Character {

	@Override
	void fight() {
		System.out.print("I am Knight: ");
		myWeapon.useWeapon();
	}

}
