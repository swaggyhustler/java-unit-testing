package jUnitTestingProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	private VendingMachine machine;
	
	@Before
	public void setUp() {
		machine=new VendingMachine();
		machine.addProduct("Soda", 10);
	}
	
	@Test
	public void testAddProduct() {
		machine.addProduct("Chips", 5);
		assertEquals(5, machine.getProductQuantity("Chips"));
	}
	
	@Test
	public void testRemoveProduct() {
		machine.removeProduct("Soda", 3);
		assertEquals(7, machine.getProductQuantity("Soda"));
	}
	
	@Test
	public void testPurchaseProduct(){
		assertTrue(machine.purchaseProduct("Soda", 5));
		assertFalse(machine.purchaseProduct("Chips", 10));
	}
}
