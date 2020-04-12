package com.designpatterns.decorator;


public class Mushroom extends PizzaDecorator {

	private final Pizza pizza;

	public Mushroom(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc()+ " ,Mushroom(10)";
	}

	@Override
	public float getPrice() {
		return pizza.getPrice()+10;
	}

}
