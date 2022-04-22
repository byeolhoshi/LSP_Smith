package org.howard.edu.lsp.finalExam;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

class MapUtilitiesTest {

	/*@BeforeAll
	public static void beforeAll() {
		MapUtilities.commonKeyValuePairs(HashMap<String, String>, HashMap<String, String>); 
	} */ 
	
	@Test
	void nullExceptionTest() throws NullMapException {
		// given
		HashMap<String, String> testMap1 = new HashMap<>();
		HashMap<String, String> testMap2 = new HashMap<>(); 
		
		// when
		testMap1.put("TestValue", "1"); 
		testMap2.put(null, null); 
		
		//then
		NullMapException thrown = Assertions.assertThrows(NullMapException.class, () -> { MapUtilities.commonKeyValuePairs(testMap1, testMap2); }, "One or both maps are null!" );
		
		Assertions.assertEquals("One or both maps are null!", thrown.getMessage());
	}
	
	@Test
	void correctCountTest() throws NullMapException {
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
		assertEquals(2, MapUtilities.commonKeyValuePairs(testMap1, testMap2)); 
		
	}
	
	@Test
	void oneEmptyHashTest() throws NullMapException {
		//given
		HashMap<String, String> testMap1 = new HashMap<>();
		HashMap<String, String> testMap2 = new HashMap<>(); 
		
		//when
		testMap1.put("TestValue", "1"); 
		
		//then
		assertEquals(0, MapUtilities.commonKeyValuePairs(testMap1, testMap2)); 
	}
	
	@Test
	void backwardsHashTest() throws NullMapException {
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
		assertEquals(2, MapUtilities.commonKeyValuePairs(testMap2, testMap1)); 
		
	}
	
	@Test
	void differentValuesTest() throws NullMapException {
		//given
		HashMap<String, String> testMap1 = new HashMap<>();
		HashMap<String, String> testMap2 = new HashMap<>(); 
		
		//when
		testMap1.put("Test", "1"); 
		testMap2.put("Test", "2");
		testMap1.put("Hi", "Hello");
		testMap2.put("Yes", "No");
		testMap1.put("Michael", "Jackson");
		testMap2.put("Hi", "Hello");
		
		//then
		assertEquals(1, MapUtilities.commonKeyValuePairs(testMap1, testMap2)); 
		
	}
	
	@Test
	void differentKeysTest() throws NullMapException {
		//given
		HashMap<String, String> testMap1 = new HashMap<>();
		HashMap<String, String> testMap2 = new HashMap<>(); 
		
		//when
		testMap1.put("Test", "1"); 
		testMap2.put("Different", "1");
		testMap1.put("Hi", "Hello");
		testMap2.put("Yes", "No");
		testMap1.put("Michael", "Jackson");
		testMap2.put("Hi", "Hello");
		
		//then
		assertEquals(1, MapUtilities.commonKeyValuePairs(testMap1, testMap2)); 
		
	}
	
	@Test
	void bothEmptyHashTest() throws NullMapException {
		//given
		HashMap<String, String> testMap1 = new HashMap<>(); // empty
		HashMap<String, String> testMap2 = new HashMap<>(); //empty 
		
		//when no values added to hashes
		
		//then
		assertEquals(0, MapUtilities.commonKeyValuePairs(testMap1, testMap2)); 
	}

}
