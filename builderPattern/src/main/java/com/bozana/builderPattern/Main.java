package com.bozana.builderPattern;

import com.bozana.builderPattern.Pizza.PizzaBuilder;

public class Main {

	public static void main(String[] args) {
		PizzaBuilder pizzaBuilder = new PizzaBuilder("Margareta")
			.dough("thin crust")
			.cheese("Mozzarella")
			.souce("Marinara")
			.size(8L);

		Pizza pizza = pizzaBuilder.build();
		System.out.println("ordered pizza: " + pizza.getDesc());

	}

}
