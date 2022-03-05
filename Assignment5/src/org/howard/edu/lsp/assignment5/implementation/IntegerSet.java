package org.howard.edu.lsp.assignment5.implementation;
import java.util.ArrayList;

public class IntegerSet {
	// Hint: probably best to use an array list.  You will need to do a little research
	private ArrayList<Integer> set = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet(ArrayList<Integer> intset) {
		this.set = intset; 
		};  

//Clears the internal representation of the set
public void clear() {
	set.clear(); 
};

//Returns the length of the set
public int length() {
	return set.size(); 
}; 

/*
 * Returns true if the 2 sets are equal, false otherwise;
* Two sets are equal if they contain all of the same values in ANY order.
*/
public boolean equals(IntegerSet b) {
	
}; 

//Returns true if the set contains the value, otherwise false
public boolean contains(int value) {
	
};    

//Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
public int largest() throws IntegerSetException {
	
}; 

//Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
public int smallest() throws IntegerSetException{
	
};


// Adds an item to the set or does nothing it already there	
public void add(int item) {
	
}; // adds item to the set or does nothing if it is in set

// Removes an item from the set or does nothing if not there
public void remove(int item) {
	
}; // Throws a IntegerSetException of the set is empty

//Set union
public void union(IntegerSet intSetb) {
	
};

//Set intersection
public void intersect(IntegerSet intSetb) {
}; 

//Set difference, i.e., s1 –s2
public void diff(IntegerSet intSetb); // set difference, i.e. s1 - s2

//Returns true if the set is empty, false otherwise
boolean isEmpty(); 

//Return String representation of your set
public String toString() {
	
}; 	// return String representation of your set

