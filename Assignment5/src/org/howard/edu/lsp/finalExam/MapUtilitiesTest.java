package org.howard.edu.lsp.finalExam;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

class MapUtilitiesTest {


	@Test
	void nullExceptionTest(){
		// given
		HashMap<String, String> testMap1 = new HashMap<>();
		HashMap<String, String> testMap2 = new HashMap<>(null); 
		
		// when
		testMap1.put("TestValue", "1"); 
		
		//then
		assertThrows(NullMapException.class, commonKeyValuePairs(testMap1, testMap2) ); 
	}
	
	@Test
	void correctCountTest() {
		//given
		HashMap<String, String> testMap1 = new HashMap<>();
		HashMap<String, String> testMap2 = new HashMap<>(); 
		
		//when
		testMap1.put("Test", "1"); 
		testMap2.put("Test", "1");
		testMap1.put("Hi", "Hello");
		testMap2.put("Yes", "No");
		testMap1.put("Michael", "Jackson");
		testMap2.put("Hi", "Hello");
		
		//then
		assertEquals(2, commonKeyValuePairs(testMap1, testMap2)); 
		
	}
	
	@Test
	void emptyHashTest() {
		//given
		HashMap<String, String> testMap1 = new HashMap<>();
		HashMap<String, String> testMap2 = new HashMap<>(); 
		
		//when
		testMap1.put("TestValue", "1"); 
		
		//then
		assertEquals(0, commonKeyValuePairs(testMap1, testMap2)); 
	}

}
