package com.bozana.decoratorPattern;

public class DecoratorB extends Decorator {

	DecoratorB( Component c ){
		this.component = c;
	}
	
	@Override
	String operation1() {
		StringBuilder str = new StringBuilder();
		str.append(component.operation1());
		if(str.length() > 0) str.append(",");
		str.append("DecoratorB.operation()");
		return str.toString();
	}

}