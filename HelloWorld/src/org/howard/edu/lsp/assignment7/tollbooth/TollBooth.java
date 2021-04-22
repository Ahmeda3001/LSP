package org.howard.edu.lsp.assignment7.tollbooth;

/**
 * TollBooth interface
 * @author ahmed
 *
 */

public interface TollBooth {
	/**
	 * calculateToll abstract method 
	 * @param x the Truck being calculated
	 * @return string 
	 */
	public String calculateToll(Truck x);
	
	/**
	 * displayData abstract method
	 * @return string
	 */
	public String displayData();
	
	/**
	 * reset abstract method
	 * @return string
	 */
	public String reset();
}
