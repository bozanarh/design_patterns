package com.bozana.builderPattern;

public class Pizza {
	
	private String pizzaDesc;

	//c-tor converts data from PizzaBuilder into format which Pizza requires
	public Pizza(PizzaBuilder builder ){
		pizzaDesc = builder.toString();
	}
	
	public String getDesc(){
		return pizzaDesc;		
	}

	//create Builder as static inner class so we can instantiate it without Pizza
	public static class PizzaBuilder{
		private String dough;
		private Long size;
		private String cheese;
		private String souce;
		private String name;
		
		public PizzaBuilder(String name){
			this.name = name;
		}
		public PizzaBuilder name(String name){
			this.name = name;
			return this;
		}
		
		public PizzaBuilder size(Long size){
			this.size = size;
			return this;
		}
		
		public PizzaBuilder dough(String dough){
			this.dough = dough;
			return this;
		}
		public PizzaBuilder souce(String souce){
			this.souce = souce;
			return this;
		}
		
		public PizzaBuilder cheese(String cheese){
			this.cheese = cheese;
			return this;
		}
		
		public Pizza build(){
			return new Pizza( this );
		}
		
		public String toString(){
			StringBuilder str = new StringBuilder();
			str.append("name= ").append(name);
			str.append(", dough=").append(dough);
			str.append(", souce= ").append(souce);
			str.append(", cheese= ").append(cheese);
			str.append(", size= ").append(size);
			
			return str.toString();
		}
	}
	
}
