package jUnitTestingProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilTest {
	@Test
	public void testRemoveFirstAndSecondA() {
		assertEquals("BCD", StringUtil.removeFirstAndSecondA("ABCD"));
		assertEquals("BC", StringUtil.removeFirstAndSecondA("AABC"));
		assertEquals("BCD", StringUtil.removeFirstAndSecondA("BACD"));
		assertEquals("BBAA", StringUtil.removeFirstAndSecondA("BBAA"));
		assertEquals("BAGAD", StringUtil.removeFirstAndSecondA("ABAGAD"));
		
	}
}
