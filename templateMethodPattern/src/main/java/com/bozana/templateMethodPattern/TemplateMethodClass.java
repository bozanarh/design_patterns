package com.bozana.templateMethodPattern;

public abstract class TemplateMethodClass {

	abstract public void  primitiveOperation1(); //subclass will implement
	abstract public void primitiveOperation2(); //subclass will implement
	
	//subclass cannot change
	final private void concreateOperation(){
		System.out.println(this.getClass().getName() + ": concreateOperation() - base class; subclass cannot change it");
	}
	
	final public void templateMethod(){
		System.out.println(this.getClass().getName() + ": templateMethod() - base class");
		concreateOperation();
		primitiveOperation1();
		hook();
		primitiveOperation2();
	}
	
	//subclass may implement
	public void hook(){
		System.out.println(this.getClass().getName() + ": hook() - base class implementation");
	}
}
