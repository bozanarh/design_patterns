package com.bozana.statePattern;

public class StateTwo extends State {
	
	public StateTwo(){}


	@Override
	public void aFunc() {
		System.out.println("StateTwo.aFunc() - doing NOTHING");	
	}

	@Override
	public void bFunc() {
		System.out.println("StateTwo.bFunc() - doing something...");
		getContext().setCurrentState(StateConstants.STATE1);
	}

	@Override
	public void cFunc() {
		System.out.println("StateTwo.cFunc() - doing something...");
		getContext().setCurrentState(StateConstants.STATE3);
	}

}
