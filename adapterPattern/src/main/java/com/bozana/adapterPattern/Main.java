package com.bozana.adapterPattern;

public class Main {

	public static void main(String[] args) {
		//We have wild turkey and we have to adapt it to Duck interface
		Turkey t = new WildTurkey();
		
		TurkeyAdapterForDuck adapter = new TurkeyAdapterForDuck(t);
		
		//calling Duck interface
		adapter.fly();
		adapter.quack();
	}

}
