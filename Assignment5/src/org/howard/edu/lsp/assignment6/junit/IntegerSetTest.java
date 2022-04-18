package org.howard.edu.lsp.assignment6.junit; 
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;
public class IntegerSetTest {
	
	ArrayList<Integer> a = new ArrayList<Integer>(); 
	
	@Test
	public void testAdd() {
		IntegerSet testSet = new IntegerSet(a); 
		testSet.add(6); 
		assertEquals(6, testSet.get(0));
	}
	
	@Test
	public void testContains() {
		IntegerSet testSet = new IntegerSet(a);
		testSet.add(6); 
		assertEquals(true, testSet.contains(6)); 
	}
	
	@Test
	public void testLength() {
		IntegerSet testSet = new IntegerSet(a); 
		testSet.add(6); 
		testSet.add(7);
		testSet.add(8);
		assertEquals(3, testSet.length());
	}
	@Test
	public void testEquals() {
		IntegerSet testSet = new IntegerSet(a); 
		IntegerSet testSet2 = new IntegerSet(a);
		testSet.add(6); 
		testSet.add(7); 
		testSet2.add(7);
		testSet2.add(6); 
		assertEquals(true, testSet.equals(testSet2));
	}
	@Test
	public void testClear() {
		IntegerSet testSet = new IntegerSet(a); 
		testSet.add(6); 
		testSet.clear();
		assertEquals(0, testSet.length());
	}
	@Test
	public void testRemove() {
		IntegerSet testSet = new IntegerSet(a); 
		testSet.add(6); 
		testSet.add(7); 
		testSet.add(8); 
		testSet.remove(6); 
		assertFalse(testSet.contains(6));
	}
	@Test
	public void testIsEmpty() {
		IntegerSet testSet = new IntegerSet(a); 
		testSet.add(6); 
		assertFalse(testSet.isEmpty());
		testSet.clear();
		assertEquals(true, testSet.isEmpty()); 
	}
	
	@Test
	public void testSmallest() throws IntegerSetException {
		IntegerSet testSet = new IntegerSet(a); 
		testSet.add(6); 
		testSet.add(7);
		testSet.add(3);
		testSet.add(19);
		assertEquals(3, testSet.smallest()); 
	}
	
	@Test
	public void testLargest() throws IntegerSetException {
		IntegerSet testSet = new IntegerSet(a); 
		testSet.add(6); 
		testSet.add(7);
		testSet.add(3);
		testSet.add(19);
		assertEquals(19, testSet.largest()); 
	}
	
	@Test
	public void testUnion() {
		IntegerSet testSet = new IntegerSet(a); 
		IntegerSet testSet2 = new IntegerSet(a);
		testSet.add(6); 
		testSet.add(7); 
		testSet2.add(8);
		testSet2.add(9); 
		testSet.union(testSet2); 
		if (testSet.contains(8)) {
			assertEquals(true, testSet.contains(9));
		}
		else {
			fail("No union detected"); 
		}
	}
	
	@Test
	public void testIntersect() {
		IntegerSet testSet = new IntegerSet(a); 
		IntegerSet testSet2 = new IntegerSet(a);
		testSet.add(6); 
		testSet.add(7);
		testSet2.add(6);
		testSet2.add(19);
		testSet.intersect(testSet2); 
		if (testSet.length() == 1) { // because the set should only contain the 1 value, 6
			assertEquals(true, testSet.contains(6));
		}
		else{
			fail("Intersection did not properly occur"); 
		}
	}

	@Test
	public void testDiff() {
		IntegerSet testSet = new IntegerSet(null); 
		IntegerSet testSet2 = new IntegerSet(null);
		testSet.add(6); 
		testSet.add(7);
		testSet2.add(6);
		testSet2.add(19);
		testSet.diff(testSet2); 
		if (testSet.length() == 2) {
			if (testSet.contains(7)) {
				assertEquals(true, testSet.contains(19)); 
			}
		}
		else {
			fail("Difference did not properly occur"); 
		}
	}
	
	@Test
	public void testString() {
		IntegerSet testSet = new IntegerSet(null); 
		testSet.add(6); 
		String newSet = testSet.toString();
		assertTrue(newSet instanceof String); 
	}

}
