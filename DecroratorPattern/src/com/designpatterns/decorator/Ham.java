package com.designpatterns.decorator;

public class Ham extends PizzaDecorator {

	private final Pizza pizza;

	public Ham(Pizza pizza1) {
		// TODO Auto-generated constructor stub
		this.pizza = pizza1;
		
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return pizza.getDesc()+ " ,Ham(15)";
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+ 15;
	}

}
