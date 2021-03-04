package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;


/**
 * 
 * Self defined IntegerSetException which extends exception
 * @author ahmed
 *
 */
class IntegerSetException extends Exception {

	private static final long serialVersionUID = 1L;
	String str1;
	
	IntegerSetException(String str2){
		str1 = str2;
	}
	
	public String toString() {
		return("IntegerSetException Occurred: " + str1);
	}
}

/**
 * 
 * IntegerSet class which contains all of the methods
 * @author ahmed
 *
 */
public class IntegerSet {
	
	private ArrayList<Integer> set = new ArrayList<Integer>();
	
	// Getter
	public ArrayList<Integer> getSet() {
		return set;
	}
	
	// Setter
	public void setTheSet(ArrayList<Integer> newSet) {
		this.set = newSet;
	}
	
	/**
	 * Method to clear the set
	 */
	public void clear() {
		set.clear();
	}
	
	/**
	 * Method to find the length of the set
	 * @return The length of the set as an int
	 */
	public int length() {
		return set.size();
	}
	
	/**
	 * Method to see if two sets are equal
	 * @param b The second set
	 * @return True if the sets are equal, false if they are not 
	 */
	public boolean equals(IntegerSet b) {
		if(set.size() != b.length()) {
			return false;
		} else {
			for(int i = 0; i < set.size(); i ++) {
				if (b.contains(set.get(i)) == false) {
					return false;
				}
			}
			return true;
		}
		
	}
	
	/**
	 * Method to see if the set contains a value
	 * @param value The value to be searched for in the set
	 * @return True if the set contains the value, false if it does not 
	 */
	public boolean contains(int value) {
		for (int i = 0; i<set.size(); i++) {
			if (set.get(i) == value) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Method to find the largest value of the array 
	 * @return The largest value in the array as an int
	 * @throws IntegerSetException If the set is empty 
	 */
	public int largest() throws IntegerSetException {
		if(set.size() == 0) {
			throw new IntegerSetException("The set is empty");
		} else {
			int max = 0;
			for (int i = 0; i< set.size(); i++) {
				if(set.get(i) >= max) {
					max = set.get(i);
				}
			}
			return max;
		}
	}
	
	/**
	 * Method to find the smallest value of the array
	 * @return The smallest value in the array as an int
	 * @throws IntegerSetException If the set is empty 
	 */
	public int smallest() throws IntegerSetException {
		if(set.size() == 0) {
			throw new IntegerSetException("The set is empty");
		} else {
			int min = set.get(0);
			for (int i = 0; i <set.size(); i++) {
				if(set.get(i) <= min) {
					min = set.get(i);
				}
			}
			return min;
		}
	}
	
	/**
	 * Method to add an item to the set, does nothing if the item is already in the array
	 * @param item the item to be added
	 */
	public void add(int item) {
		if(set.contains(item)) {
			;
		} else {
			set.add(item);
		}
	}
	
	/**
	 * Method to remove an item from the set, does nothing if the item is not already in the set
	 * @param item
	 */
	public void remove(int item) {
		for (int i = 0; i < set.size(); i++) {
			if(set.get(i) == item) {
				set.remove(i);
			}
		}
	}
	
	/**
	 * Method to union two sets together, changes the first set but not the second
	 * @param intSetb the second set of the union
	 */
	public void union(IntegerSet intSetb) {
		ArrayList<Integer> b = intSetb.getSet();
		for(int i = 0; i < b.size(); i++) {
			if(set.contains(b.get(i)) == false) {
				set.add(b.get(i));
			}
		}
	}
	
	/**
	 * Method to intersect two sets, changes the first set, but not the second
	 * @param intSetb the second set of the intersection
	 */
	public void intersection(IntegerSet intSetb) {
		ArrayList<Integer> b = intSetb.getSet();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i = 0; i <b.size(); i++) {
			if(set.contains(b.get(i)) == true) {
				temp.add(b.get(i));
			}
		}
		setTheSet(temp);
	}
	
	/**
	 * Method to get the difference between two sets, changes the first set, but not the second
	 * @param intSetb the second set of the difference
	 */
	public void difference(IntegerSet intSetb) {
		ArrayList<Integer> b = intSetb.getSet();
		for(int i = 0; i <b.size(); i++) {
			if(set.contains(b.get(i)) == true) {
				set.remove(b.get(i));
			}
		}
	}
	
	/**
	 * Method to check if the set is empty
	 * @return True if the set is empty, false if it is not
	 */
	public boolean isEmpty() {
		if (set.size() != 0) {
			return false;
		}
		return true;
	}
	
	/**
	 * Method to translate the set to a string
	 */
	public String toString() {
		String mssg = "";
		for(int i = 0; i < set.size(); i++) {
			mssg += set.get(i) + " ";
		}
		return mssg;
	}
	
}
