package org.howard.edu.lsp.exam.question41;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * JUnit test cases for the RemovesZero class
 * The toString method is not tested because it only exists for testing purposes
 * @author ahmed
 *
 */
class RemovesZeroTest {
	ArrayList<Integer> arr;
	RemovesZero rmv;

	/**
	 * setUp method which initializes the objects used in the tests
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		arr = new ArrayList<Integer>();
		rmv = new RemovesZero();
	}

	/**
	 * Testing removeZeros method functionality 1/3
	 */
	@DisplayName("First removeZeros test, should return '1 3 2 ")
	@Test
	void testRemoveZeros() {
		arr.add(0);
		arr.add(1);
		arr.add(3);
		arr.add(0);
		arr.add(2);
		rmv.removeZeros(arr);
		
		assertEquals("1 3 2 ", rmv.toString(arr));
	}
	
	/**
	 * Testing removesZeros method functionality 2/3
	 */
	@DisplayName("Second removeZeros test, should return ''")
	@Test
	void testRemoveZeros2() {
		arr.add(0);
		arr.add(0);
		arr.add(0);
		rmv.removeZeros(arr);
		
		assertEquals("", rmv.toString(arr));
	}
	
	/**
	 * Testing removesZeros method functionality 3/3
	 */
	@DisplayName("Third removeZeros test, should return '4 5 6 '")
	@Test
	void testRemoveZeros3() {
		arr.add(4);
		arr.add(5);
		arr.add(6);
		rmv.removeZeros(arr);
		
		assertEquals("4 5 6 ", rmv.toString(arr));
	}

}
