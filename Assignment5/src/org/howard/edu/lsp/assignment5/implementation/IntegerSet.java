package org.howard.edu.lsp.assignment5.implementation;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.stream.Collectors;

public class IntegerSet{
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

public int get(int index) { // i added this myself
	return set.get(index); 
}
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
	boolean flag = false; 
	for(int e : set) {
		if(e==item) {
			flag = true; 
		}
	}
	
	if (flag ==false) {
		set.add(item); 
	}
};

// Removes an item from the set or does nothing if not there
public void remove(int item) {
	boolean flag = false; 
	for(int e : set) {
		if (e==item) {
			flag = true; 
		}
	}
	
	if (flag==false) {
		set.remove(item); 
	}; 
}; 

//Set union
public void union(IntegerSet intSetb) {
	for(int i=0; i<intSetb.length(); i++) {
		set.add(intSetb.get(i));
	}; 
};

//Set intersection
public void intersect(IntegerSet intSetb) {
	ArrayList<Integer> intSetb_copy = new ArrayList<Integer>(); 
	for(int i=0; i<intSetb.length(); i++) {
		intSetb_copy.add(i, intSetb.get(i));
	}; 
	set.retainAll(intSetb_copy); 
}; 

//Set difference, i.e., s1 –s2
public void diff(IntegerSet intSetb) {
	for(int i=0; i<set.size(); i++) { // [4,1,9,2] [7,2,0,8]
		if(intSetb.contains(set.get(i))) { // [2] 
			set.remove(set.get(i)); // [4, 1, 9] 
			intSetb.remove(set.get(i));
		}; 
	} // where set = s1 and intSetb = s2
	
	for(int i=0; i<intSetb.length();i++) {
		set.add(intSetb.get(i)); 
	}

};
//Returns true if the set is empty, false otherwise
boolean isEmpty() {
	if(set.size()==0) {
		return true; 
	}
	else {
		return false; 
	}
	}; 


//Return String representation of your set
public String toString() {
	String str_set = set.stream().map(Object::toString).collect(Collectors.joining(", "));
	return str_set; 
}; 
} ;  	// return String representation of your set

