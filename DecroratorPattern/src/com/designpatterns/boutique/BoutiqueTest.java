package com.designpatterns.boutique;

public class BoutiqueTest {
public static void main(String[] args) {
	Boutique saree = new Saree();
	
	saree = new SilkSaree(saree);
	saree = new BenarasiSilkSaree(saree);
	System.out.println("Description : " + saree.getDesc() + " \nPrice: " + saree.getPrice());

	Boutique coat = new Coat();
	coat = new GoldButtonCoat(coat);
	coat = new SilverButtonCoat(coat);
	System.out.println("Description : " + coat.getDesc() + " \nPrice: " + coat.getPrice());

}
}
