package com.bozana.templateMethodPattern;

public class ConcreteClass2 extends TemplateClass {

	@Override
	public void primitiveOperation1() {
		System.out.println(this.getClass().getName() + ": primitiveOperation1() - subclass implementation");
	}

	@Override
	public void primitiveOperation2() {
		System.out.println(this.getClass().getName() + ": primitiveOperation2() - subclass implementation");
	}

	@Override
	public void hook(){
		System.out.println(this.getClass().getName() + ": hook() - subclass implementation");
	}
}
