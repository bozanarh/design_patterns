package com.bozana.statePattern;

public abstract class State {
	
	private StateContext context;
	
	public StateContext getContext() {
		return context;
	}

	public void setContext(StateContext context) {
		this.context = context;
	}

	protected void changeState(State newState){
		context.changeState(newState);
	}
	
	//states implement these
	abstract public void aFunc();
	
	abstract public void bFunc();
	
	abstract public void cFunc();
	
}
