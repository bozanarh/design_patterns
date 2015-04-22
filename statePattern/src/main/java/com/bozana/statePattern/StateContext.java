package com.bozana.statePattern;

import java.util.HashMap;
import java.util.Map;

//StateContext defines the interface of interest to client
//and maintains current state
public class StateContext {
	State currentState;
	Map<StateConstants, State> availableStates = new HashMap();
	
	public Map<StateConstants, State> getAvailableStates() {
		return availableStates;
	}

	public void setAvailableStates(Map<StateConstants, State> availableStates) {
		this.availableStates = availableStates;
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(StateConstants state) {
		this.currentState = availableStates.get(state);
		//System.out.println("In setCurrentState." + state.toString());
	}

	public StateContext(){
		currentState = availableStates.get(StateConstants.STATE1);
	}
		
	public void changeState(State state){
		currentState = state;
	}
	
	//This is interface that of interest to the client
	public void aFunc(){
		currentState.aFunc();
	}
	
	public void bFunc(){
		currentState.bFunc();
	}
	
	public void cFunc(){
		currentState.cFunc();
	}
	
	
}
