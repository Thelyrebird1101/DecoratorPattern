package com.designpatterns.decorator;

public class SimplyNonVegPizza implements Pizza {

	@Override
	public String getDesc() {
		return "SimplyNonVegPizza(350)";
	}

	@Override
	public float getPrice() {
		return 350;
	}

}
