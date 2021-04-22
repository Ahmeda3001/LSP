package org.howard.edu.lsp.exam.question40;

/**
 * Goose class which extends the Animal abstract class and implements the Flying interface
 * @author ahmed
 *
 */
public class Goose extends Animal implements Flying{
	
	/**
	 * move method overridden from Animal class
	 * @return a message as a string
	 */
	public String move() {
		return "This goose moves forward";
	}
	
	/**
	 * speak method overridden from Animal class
	 * @return a message as a string
	 */
	public String speak() {
		return "This goose speaks";
	}

	/**
	 * fly method overridden from Flying interface
	 * @return a message as a string
	 */
	public String fly() {
		return "This goose flies";
	}

}
