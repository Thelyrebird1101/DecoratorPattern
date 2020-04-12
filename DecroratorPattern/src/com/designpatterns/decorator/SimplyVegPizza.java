package com.designpatterns.decorator;

public class SimplyVegPizza implements Pizza {

	@Override
	public String getDesc() {
		return "SimplyVegPizza (230)";
		
	}

	@Override
	public float getPrice() {
		return 230;
	}

}
