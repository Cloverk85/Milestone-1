package gpsLocator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class inventoryManager<Product> {
	// for each product we will use a parallel array to store the quantity
    ArrayList<salableProduct> inventory; ;
    ArrayList<Product> products = new ArrayList<Product>();
    Scanner sc = new Scanner(System.in);
    inventoryManager()
    {
        // initialize the inventory


    }
    @SuppressWarnings("null")
	public void addProduct(salableProduct product) {
        // method to add a new product to the inventory
        salableProduct.add(product);
        ArrayList<Product> product1 = null;
		product1.add(null);
    }
    @SuppressWarnings("null")
	Product getID(int id) {
        // given a product id, return the stock of that product
        int index;
        salableProduct[] product = null;
		for(salableProduct i : product) {
            if(i.getId() == id) {
                // then find the index of that id
                index = product.length;
                ArrayList<Product> quantity = null;
				return(quantity.get(index));// return the quantity of that product
            }
        }
		return null;
    
    }
    
    @SuppressWarnings("unchecked")
	void addStock(int id, Collection<? extends Product> addedStockValue) {
        // add the specified amount of stock to given id. if id is not found create a new id add the stock to it
        int index;
        ArrayList<Product> quantity;
		for(Product i : products) {
            if(((salableProduct) i).getId() == id) {
                // then find the index of that id
                index = products.indexOf(i);
                
                int value = (int) quantity.get(index); //get the current value of the stock
                // add the new stock to that product
                quantity.setBit(index, value = addedStockValue);
                return;
            }
        }
        // if the loop ends , then the product is not there, so create anew 
        System.out.print("\nEnter the name of  the product : ");
        String name = sc.next();
        System.out.print("\nEnter the price of the product : ");
        float price = sc.nextFloat();

        // create the new product
        products.add((Product) new salableProduct(name, id, price));
        // add the stock to the array list
        quantity.addAll(addedStockValue);
    }

    @SuppressWarnings("unchecked")
	void  removeStock(int id, salableProduct stockToRemove) {
        // find the exact product
        int index;
        for(Product i : products) {
            if(((salableProduct) i).getId() == id) {
                // then find the index of that id
                index = products.indexOf(i);
                
                Object quantity;
				salableProduct value = (salableProduct) ((ArrayList<Product>) quantity).get(index); //get the current value of the stock
                // update the new stock to that product
                value = stockToRemove;
                if(value < 0) {
                    // if value is negative, set it as 0
                    value = 0;
                }
                ((ArrayList<salableProduct>) quantity).set(index, value);
                
            }
        }
    }

    @SuppressWarnings("null")
	salableProduct getProduct(int id) {
        // return the product
        @SuppressWarnings("unused")
		int index;
        Product[] salableProduct = null;
		for(Product i : salableProduct) {
            if(((salableProduct) i).getId() == id) {
                return (salableProduct) i;
            }
        }
		return null;
    }


}
