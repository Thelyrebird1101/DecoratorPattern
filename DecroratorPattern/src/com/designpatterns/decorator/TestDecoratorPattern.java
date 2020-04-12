package com.designpatterns.decorator;
import java.text.DecimalFormat;

public class TestDecoratorPattern {
public static void main(String[] args) {
	DecimalFormat dformat = new DecimalFormat("#.##");
	
	Pizza pizza = new SimplyVegPizza();
	
	pizza = new RomaTomatoesPizza(pizza);
	pizza = new GreenOlivesPizza(pizza);
	pizza = new Mushroom(pizza);
	
	System.out.println("Description: "+ pizza.getDesc());
	System.out.println("Price: "+ dformat.format(pizza.getPrice()));
	
	Pizza pizza1 = new SimplyNonVegPizza();
	
	pizza1 = new Meat(pizza1);
	pizza1 = new Cheese(pizza1);
	pizza1 = new Ham(pizza1);
	
	System.out.println("Description: "+ pizza1.getDesc());
	System.out.println("Price: "+ dformat.format(pizza1.getPrice()));
	
}
}
