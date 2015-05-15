package com.bozana.adapterPattern;

/**
 * 
 * @author bozana
 *
 * Adapts Turkey to Duck interface
 */
public class TurkeyAdapterForDuck implements Duck {
	Turkey turkey;
	
	public TurkeyAdapterForDuck( Turkey t){
		this.turkey = t;
	}
	
	public void fly() {
		//Turkey cannot fly so long as Duck; must do it in a loop
		//to achieve similar to Duck
		for( int i=0; i < 5; i++ ){
			turkey.fly();
		}
	}

	public void quack() {
		//Turkey knows how to gobble, so we use that one
		turkey.gobble();
	}

}
