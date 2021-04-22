package org.howard.edu.lsp.assignment7.tollbooth;

/**
 * AlleghenyTollBooth class which implements the TollBooth interface
 * @author ahmed
 *
 */
public class AlleghenyTollBooth implements TollBooth {
	
	private int totalTolls = 0;
	private int totalTrucks = 0;
	
	/**
	 * getter for the totalTolls attribute
	 * @return the integer totalTolls
	 */
	public int getToll() {
		return totalTolls;
	}
	
	/**
	 * getter for the totalTrucks attribute
	 * @return the integer for totalTrucks
	 */
	public int getTrucks() {
		return totalTrucks;
	}

	/**
	 * override for calculateToll method from the tollBooth interface
	 * @return the calculation message as a string
	 */
	public String calculateToll(Truck x) {
		int truckAxles = x.getAxels();
		int truckWeight = x.getWeight();
		
		int axleCost = truckAxles * 5;
		int halfTons = truckWeight / 1000;
		
		int totalCost = axleCost + (halfTons * 10);
		
		totalTolls += totalCost;
		totalTrucks += 1;
		
		String tollMssg = "Truck arrival - Axels: " + truckAxles + " Total Weight: " + truckWeight + " Toll due: $" + totalCost;
		
		return tollMssg;
	}

	/**
	 * override for the displayData method from the tollBooth interface
	 * @return the display message as a string
	 */
	public String displayData() {
		String displayMssg = "Totals since the last collection - receipts: $" + totalTolls + " Trucks: " + totalTrucks;
		return displayMssg;
	}

	/**
	 * override for the reset method from the tollBooth interface
	 * @return the reset message as a string
	 */
	public String reset() {
		String resetMssg = "*** Collecting receipts ***\n Totals since the last collection - receipts: $" + totalTolls + " Trucks: " + totalTrucks;
		totalTolls = 0;
		totalTrucks = 0;
		return resetMssg;
	}

}
