package com.designpatterns.boutique;

public class SilkSaree extends BoutiqueDecorator {

	private final Boutique saree;

	public SilkSaree(Boutique saree) {
		// TODO Auto-generated constructor stub
		this.saree = saree;
		
	}

	@Override
	public String getDesc() {
		return saree.getDesc()+" , Silk Saree(500)";
	}
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return saree.getPrice()+ 500;
	}
	

}
