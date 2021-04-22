package org.howard.edu.lsp.assignment7.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment7.tollbooth.AlleghenyTollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.FordTruck;
import org.howard.edu.lsp.assignment7.tollbooth.NissanTruck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * JUnit test cases for the AlleghenyTollBooth class
 * @author ahmed
 *
 */
class AlleghenyTollBoothTest {
	
	
	AlleghenyTollBooth booth;
	FordTruck ford;
	NissanTruck nissan;
	

	/**
	 * setUp method which initializes the objects to be used in the tests
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		booth = new AlleghenyTollBooth();
		ford = new FordTruck(5, 12000);
		nissan = new NissanTruck(2, 5000);
	}

	/**
	 * calculateToll test for functionality
	 */
	@DisplayName("calculateToll test")
	@Test
	void testCalculateToll() {
		String toll = booth.calculateToll(ford);
		assertEquals(1, booth.getTrucks());
		assertEquals(145, booth.getToll());
		assertEquals("Truck arrival - Axels: 5 Total Weight: 12000 Toll due: $145",toll);
	}

	/**
	 * displayData test for functionality
	 */
	@DisplayName("displayData test")
	@Test
	void testDisplayData() {
		booth.calculateToll(ford);
		assertEquals("Totals since the last collection - receipts: $145 Trucks: 1", booth.displayData());
		
	}

	/**
	 * reset test for functionality
	 */
	@DisplayName("reset test")
	@Test
	void testReset() {
		booth.calculateToll(nissan);
		assertEquals("*** Collecting receipts ***\n Totals since the last collection - receipts: $60 Trucks: 1", booth.reset());
		assertEquals(booth.getToll(), 0);
		assertEquals(booth.getTrucks(), 0);
	}
	

}