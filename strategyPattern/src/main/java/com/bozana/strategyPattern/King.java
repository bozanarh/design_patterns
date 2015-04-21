package com.bozana.strategyPattern;

public class King extends Character {

	@Override
	void fight() {
		System.out.print("I am King: ");
		myWeapon.useWeapon();
	}

}
