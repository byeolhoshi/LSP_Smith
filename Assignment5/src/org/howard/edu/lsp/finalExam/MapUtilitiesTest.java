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
		HashMap<String, String> testMap2 = new HashMap<>(null); 
		
		// when
		testMap1.put("TestValue", "1"); 
		
		//then
		NullMapException thrown = Assertions.assertThrows(NullMapException.class, () -> { MapUtilities.commonKeyValuePairs(testMap1, testMap2); } );
		
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
	void emptyHashTest() throws NullMapException {
		//given
		HashMap<String, String> testMap1 = new HashMap<>();
		HashMap<String, String> testMap2 = new HashMap<>(); 
		
		//when
		testMap1.put("TestValue", "1"); 
		
		//then
		assertEquals(0, MapUtilities.commonKeyValuePairs(testMap1, testMap2)); 
	}

}
