package com.designpatterns.decorator;

public class GreenOlivesPizza extends PizzaDecorator {

	private final Pizza pizza;

	public GreenOlivesPizza(Pizza pizza) {
		this.pizza = pizza;
		
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc()+ " ,Green Olives(9)";
	}

	@Override
	public float getPrice() {
		return pizza.getPrice()+9;
	}

}
