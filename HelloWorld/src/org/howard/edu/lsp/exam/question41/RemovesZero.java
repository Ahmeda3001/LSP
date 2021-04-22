package org.howard.edu.lsp.exam.question41;
import java.util.ArrayList;

/**
 * RemovesZero class
 * @author ahmed
 *
 */
public class RemovesZero {
	
	/**
	 * removeZeros method which removes the zeros in an array
	 * @param arr an array list of integers
	 */
	public void removeZeros(ArrayList<Integer> arr) {
		for (int i = arr.size() -1; i > -1; i--) {
			if(arr.get(i) == 0){
				arr.remove(i);
			}
		}
	}
	
	/**
	 * toString method which turns the array list into a string for testing only
	 * @param arr an array list of integers
	 * @return a string version of the array list
	 */
	public String toString(ArrayList<Integer> arr) {
		String mssg = "";
		for(int i = 0; i < arr.size(); i++) {
			mssg += arr.get(i) + " ";
		}
		return mssg;
	}
}
