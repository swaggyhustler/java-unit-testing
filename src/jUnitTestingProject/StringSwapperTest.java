package jUnitTestingProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringSwapperTest {
	@Test
	public void testStrWithTwoChar() {
		StringSwapper swap=new StringSwapper();
		assertEquals("BA", swap.swapLastTwoChar("AB"));
	}
	@Test
	public void testStrWithTenChar() {
		StringSwapper swap=new StringSwapper();
		assertEquals("ABCDEFGHJI", swap.swapLastTwoChar("ABCDEFGHIJ"));
	}
	@Test
	public void testStrWithOneChar() {
		StringSwapper swap=new StringSwapper();
		assertEquals("A", swap.swapLastTwoChar("A"));
	}
}
