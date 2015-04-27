package com.bozana.templateMethodPattern;

public class ConcreteClass1 extends TemplateMethodClass {

	@Override
	public void primitiveOperation1() {
		System.out.println(this.getClass().getName() + ": primitiveOperation1() - subclass implementation");
	}

	@Override
	public void primitiveOperation2() {
		System.out.println(this.getClass().getName() + ": primitiveOperation1() - subclass implementation");
	}

}
