package org.howard.edu.lsp.assignment5.implementation;
import java.util.ArrayList;
import java.util.EmptyStackException;

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
	int size_b = b.length(); 
	int size_set = set.size();
	
	if(size_set == size_b) {
		return true; 
	}
	else {
		return false; 
	}
}; 

//Returns true if the set contains the value, otherwise false
public boolean contains(int value) {
	for (int i : set) {
		if(i == value) {
			return true;
		}
	}
	
	return false; 
};    

//Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
public int largest() throws IntegerSetException {
	int mx = 0; 
	
	if(set.size()==0) {
		throw new EmptyStackException(); 
	}
	
	for(int i = 0; i<set.size(); i++) {
		if(set.get(i) > mx) {
			mx = set.get(i); 
		}
	}
	
	return mx; 
}; 

//Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
public int smallest() throws IntegerSetException{
int mn = Integer.MAX_VALUE; 
	
	if(set.size()==0) {
		throw new EmptyStackException(); 
	}
	
	for(int i = 0; i<set.size(); i++) {
		if(set.get(i) < mn) {
			mn = set.get(i); 
		}
	}
	
	return mn; 
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

