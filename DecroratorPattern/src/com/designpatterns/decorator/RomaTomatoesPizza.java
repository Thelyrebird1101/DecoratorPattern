package com.designpatterns.decorator;

public class RomaTomatoesPizza extends PizzaDecorator {

	private final Pizza pizza;

	public RomaTomatoesPizza(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + " ,Roma Tomatoes(5)";
		
	}

	@Override
	public float getPrice() {
		return pizza.getPrice()+5;
	}

}
