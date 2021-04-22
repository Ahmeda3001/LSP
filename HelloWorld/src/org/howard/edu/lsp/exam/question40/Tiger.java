package org.howard.edu.lsp.exam.question40;

/**
 * Tiger class which extends the Animal abstract class
 * @author ahmed
 *
 */
public class Tiger extends Animal{
	
	/**
	 * move method overridden from animal class
	 * @return a message as a string
	 */
	public String move() {
		return "This tiger moves forward";
	}
	
	/**
	 * speak method overridden from animal class
	 * @return a message as a string
	 */
	public String speak() {
		return "This tiger speaks";
	}
}
