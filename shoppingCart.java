package gpsLocator;

import java.util.ArrayList;

public class shoppingCart {
	private ArrayList<salableProduct> cart;
	
	// Methods to manage cart
	public void addToCart(salableProduct product) {
		cart.add(product); 
		}

	
	public void removeStock(salableProduct product) {
		cart.remove(product);
	}

}