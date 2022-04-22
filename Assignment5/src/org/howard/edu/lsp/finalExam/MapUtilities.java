package org.howard.edu.lsp.finalExam;
import java.util.HashMap;
import java.util.Map;  

public class MapUtilities {
	public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String,String> map2) throws NullMapException {
		int count = 0; 
		if (map1 == null || map2 == null ) { 
			throw new NullMapException(); 
		}
		
		for(Map.Entry<String, String> element : map1.entrySet()) {
			String k = element.getKey(); 
			String v = element.getValue(); 
			
			if(map2.containsKey(k)) {
				String v2 = map2.get(k); 
				if(v == v2) {
					count++; 
				}
			}
		}
		return count; 
	}
}
