package com.bozana.decoratorPattern;

public class DecoratorC extends Decorator {

	DecoratorC( Component c ){
		this.component = c;
	}
	
	@Override
	String operation1() {
		StringBuilder str = new StringBuilder();
		str.append(component.operation1());
		if(str.length() > 0) str.append(",");
		str.append("DecoratorC.operation()");
		return str.toString();
	}}
