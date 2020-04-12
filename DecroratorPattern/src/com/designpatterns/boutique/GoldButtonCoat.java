package com.designpatterns.boutique;

public class GoldButtonCoat extends BoutiqueDecorator {

	private Boutique coat;

	public GoldButtonCoat(Boutique coat) {
		// TODO Auto-generated constructor stub
		this.coat = coat;
		
	}
	@Override
	public String getDesc() {
		return coat.getDesc()+" ,Gold Buttons(1500)";
	}
	
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return coat.getPrice()+ 500;
	}
	
	

}
