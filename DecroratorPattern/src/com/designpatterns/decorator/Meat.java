package com.designpatterns.decorator;

public class Meat extends PizzaDecorator  {
	
	

	private final Pizza pizza;

	public Meat(Pizza pizza1) {
		this.pizza = pizza1;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return pizza.getDesc()+ " ,Meat(20)";
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+ 20;
	}

}
