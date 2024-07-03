package gpsLocator;

public class storeFront {

	private inventoryManager<?> inventoryManager;
	private shoppingCart shoppingCart;
	
	@SuppressWarnings("rawtypes")
	public storeFront() {
		this.inventoryManager = new gpsLocator.inventoryManager();
		this.setShoppingCart(new shoppingCart());
	    }

	public void initializeStore() {
	}
	
	public void purchseProduct(salableProduct product) {
	}
	
	public void cancelPurchase(salableProduct product) {

	}
	
	
	public inventoryManager<?> getInventoryManager() {
		return inventoryManager;
	}

	public void setInventoryManager(inventoryManager<?> inventoryManager) {
		this.inventoryManager = inventoryManager;
	}

	public shoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(shoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	}
	