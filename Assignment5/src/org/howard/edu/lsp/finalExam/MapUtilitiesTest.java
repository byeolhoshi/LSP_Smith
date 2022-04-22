package org.howard.edu.lsp.finalExam;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

class MapUtilitiesTest {

	@BeforeAll
	void setUp() throws Exception {
		HashMap<String, String> testMap1 = new HashMap<>();
		HashMap<String, String> testMap2 = new HashMap<>(); 
	}
	
	@AfterEach
	void tearDown() {
		testMap1.clear(); 
		testMap2.clear();
	}

	@Test
	void mapContainsValuesTest() {
		testMap1.put("TestValue", "1"); 
		testMap2.put("TestValue", "1");
		
		assertEquals(false, testMap1.isEmpty()); 
	}

}
