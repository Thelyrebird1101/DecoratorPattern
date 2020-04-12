package com.designpatterns.boutique;

public class SilverButtonCoat extends BoutiqueDecorator {

	private Boutique coat;

	public SilverButtonCoat(Boutique coat) {
		// TODO Auto-generated constructor stub
		this.coat = coat;
		
	}
	
	@Override
	public String getDesc() {
		return coat.getDesc() + " ,Silver Buttons(500)";
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return coat.getPrice()+ 500;
	}

}
