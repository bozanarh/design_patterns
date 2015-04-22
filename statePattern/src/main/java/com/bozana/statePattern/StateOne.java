package com.bozana.statePattern;

public class StateOne extends State {

	public StateOne(){}

	@Override
	public void aFunc() {
		System.out.println("StateOne.aFunc(): working something...");
		//done, now move to state2
		getContext().setCurrentState(StateConstants.STATE2);
	}

	@Override
	public void bFunc() {
		System.out.println("StateOne.bFunc() - doing NOTHING");
	}

	@Override
	public void cFunc() {
		System.out.println("StateOne.cFunc() - doing NOTHING");
	}
}
