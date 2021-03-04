package org.howard.edu.lsp.assignment4;
import org.howard.edu.lsp.assignment4.IntegerSet;

public class test {
	public static void main(String[] args) throws IntegerSetException {
		IntegerSet mySet1 = new IntegerSet();
		IntegerSet mySet2 = new IntegerSet();
		IntegerSet mySet3 = new IntegerSet();
		IntegerSet mySet4 = new IntegerSet();
		IntegerSet mySet5 = new IntegerSet();
		IntegerSet mySet6 = new IntegerSet();
		
		mySet1.add(1);
		mySet1.add(2);
		mySet1.add(3);
		
		mySet2.add(1);
		mySet2.add(2);
		mySet2.add(3);
		
		mySet3.add(3);
		mySet3.add(4);
		mySet3.add(8);
		
		mySet5.add(7);
		mySet5.add(8);
		mySet5.add(9);
		
		mySet6.add(6);
		mySet6.add(7);
		mySet6.add(8);
		
		String setlist1 = mySet1.toString();
		String setlist2 = mySet2.toString();
		String setlist3 = mySet3.toString();
		String setlist4 = mySet4.toString();
		String setlist5 = mySet5.toString();
		String setlist6 = mySet6.toString();
		
		System.out.println("The original mySet1 is: " + setlist1);
		System.out.println("The original mySet2 is: " + setlist2);
		System.out.println("The original mySet3 is: " + setlist3);
		System.out.println("The original mySet4 is: " + setlist4);
		System.out.println("The original mySet5 is: " + setlist5);
		System.out.println("The original mySet6 is: " + setlist6);
				
		int small1 = mySet1.smallest();
		int large1 = mySet3.largest();
		System.out.println("The smallest int in mySet1 is: " + small1);
		System.out.println("The largest int in mySet3 is: " + large1);
		
		int len1 = mySet2.length();
		int len2 = mySet4.length();
		System.out.println("The length of mySet2 is: " + len1);
		System.out.println("The length of mySet4 is: " + len2);
		
		/*
		int small2 = mySet4.smallest();
		int large2 = mySet4.largest();
		System.out.println(small2);
		System.out.println(large2);
		*/
		
		boolean equ1 = mySet1.equals(mySet2);
		System.out.println("The result of mySet1 equals mySet2 is: " + equ1);
		
		boolean equ2 = mySet1.equals(mySet3);
		System.out.println("The result of mySet1 equals mySet3 is: " + equ2);
		
		boolean cont1 = mySet1.contains(3);
		boolean cont2 = mySet1.contains(8);
		System.out.println("The result of mySet1 containing 3 is: " + cont1);
		System.out.println("The result of mySet1 containing 8 is: " + cont2);
		
		System.out.println("The original mySet2 = " + setlist2);
		mySet2.remove(2);
		setlist2 = mySet2.toString();
		System.out.println("mySet2 after using mySet2.remove(2) = " + setlist2);
		
		System.out.println("The current mySet2 is: " +setlist2);
		mySet2.remove(2);
		setlist2 = mySet2.toString();
		System.out.println("mySet2 after using mySet2.remove(2) again = " + setlist2);
		
		System.out.println("The current mySet2 is: " +setlist2);
		mySet2.add(1);
		setlist2 = mySet2.toString();
		System.out.println("mySet2 after using mySet2.add(1) with 1 already present = " + setlist2);
		
		System.out.println("The current mySet2 is: " + setlist2);
		mySet2.clear();
		setlist2 = mySet2.toString();
		System.out.println("mySet2 after using mySet.clear() is: " + setlist2);
		
		boolean emp1 = mySet3.isEmpty();
		boolean emp2 = mySet4.isEmpty();
		System.out.println("The result of using mySet3.isEmpty is: " + emp1);
		System.out.println("The result of using mySet4.isEmpty is: " + emp2);
		
		mySet1.union(mySet5);
		String setunion = mySet1.toString();
		System.out.println("The result of a union between mySet1 and mySet5 is: " + setunion);
		
		mySet3.intersection(mySet5);
		String setinter = mySet3.toString();
		System.out.println("The result of an intersection between mySet3 and mySet5 is: " + setinter);
		
		mySet5.difference(mySet6);
		String setdiff = mySet5.toString();
		System.out.println("the result of the difference between mySet5 and mySet6 is: " + setdiff);
		
	}
}
