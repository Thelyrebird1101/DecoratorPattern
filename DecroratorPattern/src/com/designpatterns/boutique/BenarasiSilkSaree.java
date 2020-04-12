package com.designpatterns.boutique;

public class BenarasiSilkSaree extends BoutiqueDecorator {

	private final Boutique saree;

	public BenarasiSilkSaree(Boutique saree) {
		this.saree = saree;
		
	}
	
	@Override
	public String getDesc() {
		return saree.getDesc()+ " ,Benarasi Silk(1000)";
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return saree.getPrice()+1000;
	}

}
