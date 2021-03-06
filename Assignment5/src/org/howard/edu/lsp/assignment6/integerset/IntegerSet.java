package org.howard.edu.lsp.assignment6.integerset;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.stream.Collectors;

public class IntegerSet{
	/**
	   *
	   * Array List based class of integers
	   *
	*/
	private ArrayList<Integer> set = new ArrayList<Integer>();
	public IntegerSet(ArrayList<Integer> intset) {
		/**
		   *
		   * Default constructor
		   *
		*/
		this.set = intset; 
		};  
	public ArrayList<Integer> getSet(){
		return this.set; 
	}
//Clears the internal representation of the set
public void clear() {
	/**
	   *
	   * Empties the array list
	   *
	*/
	set.clear(); 
};

//Returns the length of the set
public int length() {
	/**
	   *
	   * Returns the length of the array list
	   *
	*/
	return set.size(); 
}; 


public boolean equals(IntegerSet b) {
	/**
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	*/
	//ArrayList<Integer> a = new ArrayList<Integer>(); 
	if(set.size() == b.length()) {
		ArrayList<Integer> b_copy = new ArrayList<Integer>();
		for(int i=0; i<set.size(); i++) {
			b_copy.add(b.get(i)); 
		}
		
		if(set.equals(b_copy)){
			return true; 
		}
		else {
			return false; 
		}
	}
	return false; 
}; 

public int get(int index) { 
	/**
	 * Returns the value of the array the the given index
	*/
	return set.get(index); 
}

public boolean contains(int value) {
	/**
	 * Returns true if set contains the given value, false otherwise
	*/
	for (int i : set) {
		if(i == value) {
			return true;
		}
	}
	
	return false; 
};    


public int largest() throws IntegerSetException {
	/**
	 * Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	*/
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
	/**
	 * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty 
	*/
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



public void add(int item) {
	/**
	 *Adds an item to the set or does nothing it already there	
	*/
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


public void remove(int item) {
	/**
	 *Removes an item from the set or does nothing if not there
	*/
	if (set.contains(item)) {
		for (int i =0; i<set.size(); i++) {
			if (set.get(i) == item) {
				set.remove(i); 
			}
		}
	}
}; 


public void union(IntegerSet intSetb) {
	/**
	 *Combines both sets into one (union) 
	*/
	for(int i=0; i<intSetb.length(); i++) {
		set.add(intSetb.get(i));
	}; 
};

//Set intersection
public void intersect(IntegerSet intSetb) {
	/**
	 *modifies set to only retain similar values between the sets
	*/
	ArrayList<Integer> intSetb_copy = new ArrayList<Integer>(); 
	for(int i=0; i<intSetb.length(); i++) {
		intSetb_copy.add(i, intSetb.get(i));
	}; 
	set.retainAll(intSetb_copy); 
}; 


public void diff(IntegerSet intSetb) {
	/**
	 *Modifies set to only contain the differences between them 	
	*/
	for (int item : intSetb.getSet()) {
        if (this.contains(item)) {
            this.set.remove(item);
            }
	}
};

public boolean isEmpty() {
	/**
	 *Returns true if set is empty, false otherwise. 
	*/
	if(set.size()==0) {
		return true; 
	}
	else {
		return false; 
	}
	}; 


//Return String representation of your set
public String toString() {
	/**
	 *Returns string version of set.	
	*/
	String str_set = set.stream().map(Object::toString).collect(Collectors.joining(", "));
	return str_set; 
}; 
} ;  	// return String representation of your set

