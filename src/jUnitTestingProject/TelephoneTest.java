package jUnitTestingProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TelephoneTest {
	
	private Telephone telephone;
	
	@Before
	public void setUp() {
		this.telephone=new Telephone();
	}
	
	@After
	public void tearDown() {
		telephone=null;
	}
	
	@Test
	public void testCall() {
		assertTrue(telephone.dial("1234567890"));
		assertEquals("1234567890", telephone.getCurrentNumber());
	}
	
	@Test
	public void testMakeCall() {
		telephone.dial("1234567890");
		assertTrue(telephone.makeCall());
		assertTrue(telephone.isOnCallRet());
	}
	
	@Test
	public void testMakeCallWithOutDialing() {
		telephone.dial("1234567890");
		telephone.makeCall();
		assertTrue(telephone.hangUp());
		assertFalse(telephone.isOnCallRet());
		assertNull(telephone.getCurrentNumber());
	}
	@Test
	public void testHangUpWithOutCall() {
		assertFalse(telephone.hangUp());
	}
	
	@Test
	public void testDialWhileOnCall() {
		telephone.dial("1234567890");
		telephone.makeCall();
		assertFalse(telephone.dial("0987654321"));
	}
}
