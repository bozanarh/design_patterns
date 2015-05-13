package com.bozana.decoratorPattern;

abstract class Decorator extends Component {
	protected Component component;
	
	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	abstract String operation1();

}
