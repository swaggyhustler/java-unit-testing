package jUnitTestingProject;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
	private Map<String, Integer> machine;
	public VendingMachine() {
		machine=new HashMap<String, Integer>();
	}
	
	public void addProduct(String product, int quantity) {
		int currentQuantity=machine.getOrDefault(product, 0);
		machine.put(product, currentQuantity+quantity);
	}
	
	public void removeProduct(String product, int quantity) {
		int currentQuantity=machine.getOrDefault(product, 0);
		int newQuantity=Math.max(0, currentQuantity-quantity);
		machine.put(product, newQuantity);
	}
	
	public boolean purchaseProduct(String product, int quantity) {
		int currentQuantity=machine.getOrDefault(product, 0);
		if(currentQuantity>=quantity) {
			machine.put(product, currentQuantity-quantity);
			return true;
		}
		return false;
	}
	
	public int getProductQuantity(String product) {
		return machine.getOrDefault(product, 0);
	}
}

