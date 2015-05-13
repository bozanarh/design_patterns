package com.bozana.decoratorPattern;

public class Main {

	public static void main(String[] args) {
		ConcreteComponent component1 = new ConcreteComponent();
		System.out.println(component1.operation1());
		
		DecoratorA decorator1 = new DecoratorA(component1);
		System.out.println(decorator1.operation1());
		
		DecoratorB decorator2 = new DecoratorB(decorator1);
		System.out.println(decorator2.operation1());
	
		DecoratorC decorator3 = new DecoratorC(decorator2);
		System.out.println(decorator3.operation1());
	}
}
