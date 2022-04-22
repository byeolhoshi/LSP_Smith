package org.howard.edu.lsp.finalExam;
import java.util.HashMap;
import java.util.Map;  

public class MapUtilities {
	public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String,String> map2) throws NullMapException {
		int count = 0; 
		
		try { 
			if (map1 == null || map2 == null ) { 
				throw new NullMapException("One or both maps are null!"); 
			}
			if(map1.isEmpty() || map2.isEmpty()) {
				return 0; 
			}
			
			for(Map.Entry<String, String> element : map1.entrySet()) {
				String k = element.getKey(); 
				String v = element.getValue();
				
				if (k == null || v == null) {
					throw new NullMapException("One or both maps are null!"); 
				}
			
				if(map2.containsKey(k)) {
					String v2 = map2.get(k); 
					if(v == v2) {
						count++; 
					}
				}
			}
		}
		catch(NullMapException e) {
			e.getMessage(); 
		}
		return count; 
	}
}
