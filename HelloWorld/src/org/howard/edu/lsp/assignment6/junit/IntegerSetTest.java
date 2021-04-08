package org.howard.edu.lsp.assignment6.junit;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class IntegerSetTest {
	IntegerSet intset;
	IntegerSet intset2;
	
	@BeforeEach
	protected void setUp(){
		intset = new IntegerSet();
		intset2 = new IntegerSet();
	}
	

	@Test
	@DisplayName("Tests the clear function the set length should be 0")
	void testClear() {
		intset.add(1);
		intset.add(2);
		intset.clear();
		assertEquals(0, intset.length());
	}

	@Test
	@DisplayName("First length test, the set length should be 0")
	void testLength() {
		assertEquals(0,intset.length(), "The length should return 0");
	}
	
	@Test
	@DisplayName("Secont length test, the set length should be 2")
	void testLength2() {
		intset.add(1);
		intset.add(3);
		assertEquals(2,intset.length(), "The length should return 2");
	}

	@Test
	@DisplayName("Equal set test should return true")
	void testEqualsIntegerSet() {
		assertEquals(intset.getSet(), intset2.getSet());
	}
	
	@Test
	@DisplayName("Second Equal set test should return false")
	void testEqualsIntegerSet2() {
		intset2.add(0);
		assertFalse(intset.getSet() == intset2.getSet());
	}

	@Test
	@DisplayName("First contains method test should return true")
	void testContains() {
		intset.add(0);
		assertTrue(intset.contains(0));
	}
	
	@Test
	@DisplayName("Second contains method test should return false")
	void testContains2() {
		intset.add(0);
		assertFalse(intset.contains(1));
	}

	@Test
	@DisplayName("First largest test, should return 3")
	void testLargest() {
		intset.add(1);
		intset.add(2);
		intset.add(3);
		try {
			assertEquals(3, intset.largest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Second largest test, should throw IntegerSetException")
	void testLargest2() {
		assertThrows(IntegerSetException.class, () -> intset.largest());
	}

	@Test
	@DisplayName("First smalles test, should return 1")
	void testSmallest() {
		intset.add(1);
		intset.add(2);
		intset.add(3);
		try {
			assertEquals(1, intset.smallest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Second smallest test, should throw IntegerSetException")
	void testSmallest2() {
		assertThrows(IntegerSetException.class, () -> intset.largest());
	}

	@Test
	@DisplayName("Add test, checks the set to make sure 0 was added")
	void testAdd() {
		intset.add(0);
		assertEquals("0 ", intset.toString());
	}

	@Test
	@DisplayName("Remove test, checks the set to make sure 2 was removed")
	void testRemove() {
		intset.add(1);
		intset.add(2);
		intset.add(3);
		intset.remove(2);
		assertEquals("1 3 ", intset.toString());
	}

	@Test
	@DisplayName("Union test, checks to make sure there was a proper union")
	void testUnion() {
		intset.add(1);
		intset.add(2);
		intset.add(3);
		intset2.add(4);
		intset2.add(5);
		intset2.add(6);
		intset.union(intset2);
		assertEquals("1 2 3 4 5 6 ", intset.toString());
	}

	@Test
	@DisplayName("Intersection Test checks to make sure there was a proper intersection")
	void testIntersection() {
		intset.add(1);
		intset.add(2);
		intset.add(3);
		intset2.add(2);
		intset2.add(3);
		intset2.add(4);
		intset.intersection(intset2);
		assertEquals("2 3 ", intset.toString());
	}

	@Test
	@DisplayName("Difference test, checks to makre sure the difference was found")
	void testDifference() {
		intset.add(4);
		intset.add(5);
		intset.add(6);
		intset2.add(6);
		intset2.add(7);
		intset2.add(8);
		intset.difference(intset2);
		assertEquals("4 5 ", intset.toString());
	}

	@Test
	@DisplayName("First is empty test, should return true")
	void testIsEmpty() {
		assertTrue(intset.isEmpty());
	}

	@Test
	@DisplayName("Second is empty test, should return False")
	void testIsEmpty2() {
		intset.add(0);
		assertFalse(intset.isEmpty());
	}
	
	@Test
	@DisplayName("First to String test, should return '1 2 3'")
	void testToString() {
		intset.add(1);
		intset.add(2);
		intset.add(3);
		assertEquals("1 2 3 ", intset.toString());
	}

	@AfterEach
	protected void tearDown() {}
}
