package com.bozana.templateMethodPattern;

public abstract class TemplateClass {

	abstract public void  primitiveOperation1(); //subclass will implement
	abstract public void primitiveOperation2(); //subclass will implement
	
	//subclass cannot change
	final public void concreateOperation(){
		System.out.println(this.getClass().getName() + ": concreateOperation() - base class; subclass cannot change it");
		primitiveOperation1();
		hook();
		primitiveOperation2();
	}
	
	//subclass may implement
	public void hook(){
		System.out.println(this.getClass().getName() + ": hook() - base class implementation");
	}
}
