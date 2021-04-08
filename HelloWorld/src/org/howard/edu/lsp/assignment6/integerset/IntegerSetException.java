package org.howard.edu.lsp.assignment6.integerset;

/**
 * 
 * Self defined IntegerSetException which extends exception
 * @author ahmed
 *
 */
public class IntegerSetException extends Exception {

	private static final long serialVersionUID = 1L;
	String str1;
	
	IntegerSetException(String str2){
		str1 = str2;
	}
	
	public String toString() {
		return("IntegerSetException Occurred: " + str1);
	}
}
