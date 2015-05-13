package com.bozana.decoratorPattern;

public class DecoratorA extends Decorator {

	DecoratorA( Component c ){
		this.component = c;
	}
	
	@Override
	String operation1() {
		StringBuilder str = new StringBuilder();
		str.append(component.operation1());
		if(str.length() > 0) str.append(",");
		str.append("DecoratorA.operation()");
		return str.toString();
	}

}
