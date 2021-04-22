package org.howard.edu.lsp.assignment7.tollbooth;

/**
 * FordTruck class that extends the Truck abstract class 
 * @author ahmed
 *
 */
public class FordTruck extends Truck {
	
	private int axles;
	private int weight;
	
	/**
	 * Constructor 
	 * @param axl the number of axles 
	 * @param kilos the weight in kilograms
	 */
	public FordTruck(int axl, int kilos) {
		axles = axl;
		weight = kilos;
	}

	/**
	 * overrides the getAxels method from the Truck abstract class serving as a getter
	 * @return the number of axles as an integer
	 */
	public int getAxels() {
		return axles;
	}

	/**
	 * overrides the getWeight method from the Truck abstract class serving as a getter
	 * @return the weight in kilograms as an integer
	 */
	public int getWeight() {
		return weight;
	}

}
