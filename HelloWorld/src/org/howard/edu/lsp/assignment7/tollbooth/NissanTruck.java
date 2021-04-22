package org.howard.edu.lsp.assignment7.tollbooth;

/**
 * NissanTruck class that extends the Truck abstract class
 * @author ahmed
 *
 */
public class NissanTruck extends Truck {
	
	private int axles;
	private int weight;
	
	/**
	 * constructor
	 * @param axl: the axles in the truck
	 * @param kilos the weight of the in kilograms 
	 */
	public NissanTruck(int axl, int kilos) {
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
