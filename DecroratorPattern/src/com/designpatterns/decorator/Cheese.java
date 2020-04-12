package com.designpatterns.decorator;

public class Cheese extends PizzaDecorator {

	private final Pizza pizza;

	public Cheese(Pizza pizza1) {
	this.pizza = pizza1;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+ " ,Mozzarella Cheese(11)";
	}

	@Override
	public float getPrice() {
		
		return pizza.getPrice()+11;
	}

}
