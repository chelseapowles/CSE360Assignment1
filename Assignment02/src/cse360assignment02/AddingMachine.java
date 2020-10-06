//Chelsea Powles || Assignment 1 || CSE 360 Tuesday


//package name
package cse360assignment02;


import java.util.*;
import java.io.*;

// AddingMachine class
public class AddingMachine 
{
	
	// initialize private variable
	private int total;
	//initialize a private string buffer to concatenate the string
	private StringBuffer history;
	
	
	// constructor
	public AddingMachine() 
	{
		total = 0;  // not needed - included for clarity
		// initialize the string buffer to 0 because thats what history starts at
		history = new StringBuffer("0");
	}//end of constructor
	
	
	// get method for total
	public int getTotal() 
	{
		//The getTotal method should return the current total
		return total;
	}//end of getter
	
	
	// add method that takes in an integer
	public void add(int value) 
	{
		//The add method should add the parameter to the total variable
		total = total + value;
		history.append(" + " + value);
	}//end of add
	
	
	// subtract method that takes in an integer
	public void subtract(int value) 
	{
		//The subtract method should subtract the parameter from the total variable
		total = total - value;
		history.append(" - " + value);
	}//end of subtract
	
	
	//to string method
	public String toString() 
	{
		return history.toString();
	}//end of to string
	
	
	// method to clear the history
	public void clear() 
	{
		//The clear method should clear your "memory".
		history.delete(0, history.length());
	  
	}//end of clear
	
}//end of public class