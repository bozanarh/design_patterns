package com.bozana.strategyPattern;

public class Troll extends Character {

	@Override
	void fight() {
		System.out.print("I am old Toll: ");
		myWeapon.useWeapon();
	}

}
