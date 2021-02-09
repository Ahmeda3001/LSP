package org.howard.edu.lsp.assignment2;
import java.util.*;

public class Combination {

	//basic method that finds the sum of the set entered
	static int sum(Set<Integer> input, int[] arr) {
		int total = 0;
		for (int i: input) {
			total += arr[i];
	    }
	    return total;
	}

	//the main method which puts together the combinations
	static Set<Set<Integer>> combinationCheck(int[] arr, int target) {
		//declares a result set which will hold the target combinations
	    Set<Set<Integer>> result = new HashSet<>();
	    //initializes a for loop which goes through the array
	    for(int i = 0; i < arr.length; i++) {
	    	//a nested for loop which takes a second value from the array
	    	for(int j = 1; j < arr.length; j++) {
	    		//declares a temporary set used as a place holder for combinations being tested
	    		Set<Integer> comboSet = new HashSet<Integer>();
	    		comboSet.add(i);
	    		//checks if the sum of the placeholder set is equal to the target and adds matches to the result.
	    		if(arr[i] == target) {
	    			result.add(comboSet);
	    			continue;
	    		}
	    		comboSet.add(j);  
	    		if (sum(comboSet, arr) < target && j < arr.length-1){
	    			comboSet.add(j+1);
	    		}
	    		if (sum(comboSet, arr) == target) {
	    			result.add(comboSet);
	    			continue;
	    		} else if(sum(comboSet, arr) > target) {
	    			comboSet.remove(j);
	    			continue;
	    		} 
	    	}     
	    }
	    return result;
	}
}
