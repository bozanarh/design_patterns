package com.bozana.statePattern;

public class StateThree extends State {
	public StateThree(){}

	@Override
	public void aFunc() {
		System.out.println("StateThree.aFunc() - doing something...");
		getContext().setCurrentState(StateConstants.STATE1);
	}

	@Override
	public void bFunc() {
		System.out.println("StateThree.bFunc() - doing NOTHING");	
	}

	@Override
	public void cFunc() {
		System.out.println("StateThree.cFunc() - doing NOTHING");
	}

}
