package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
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
	
	public void clear() {
		set.clear();
	}
	
	public int length() {
		return set.size();
	}
	
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
	
	public boolean contains(int value) {
		for (int i = 0; i<set.size(); i++) {
			if (set.get(i) == value) {
				return true;
			}
		}
		return false;
	}
	
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
	
	public void add(int item) {
		if(set.contains(item)) {
			;
		} else {
			set.add(item);
		}
	}
	
	public void remove(int item) {
		if(set.contains(item) == false) {
			;
		} else {
			set.remove(item);
		}
	}
	
	public void union(IntegerSet intSetb) {
		ArrayList<Integer> b = intSetb.getSet();
		for(int i = 0; i < b.size(); i++) {
			if(set.contains(b.get(i)) == false) {
				set.add(b.get(i));
			}
		}
	}
	
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
	
	public void difference(IntegerSet intSetb) {
		ArrayList<Integer> b = intSetb.getSet();
		for(int i = 0; i <b.size(); i++) {
			if(set.contains(b.get(i)) == true) {
				set.remove(b.get(i));
			}
		}
	}
	
	public boolean isEmpty() {
		if (set.size() != 0) {
			return false;
		}
		return true;
	}
	
	public String toString() {
		String mssg = "";
		for(int i = 0; i < set.size(); i++) {
			mssg += set.get(i) + " ";
		}
		return mssg;
	}
	
}
