package collections;
/*
 * Map is also an inbuilt data structure in Java
 * Map will store data in key and value pairs
 * Map does not allow duplicate keys but duplicate values are allowed
 * Map is an interface which is implemented by
 * HashMap
 * LinkedHashMap
 * TreeMap
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args) {
		//create a Map
		Map<String, Double>  fees = new HashMap<>();
		
		//add the data to the Map
		fees.put("python", 6000.00);
		fees.put("selenium", 8000.00);
		fees.put("core java", 4000.00);
		fees.put("testing", 12000.00);
		fees.put("SAP", 13000.00);
		
		//print the value of Map
		System.out.println(fees);
		
		//retrieve the data from the map
		System.out.println("fees for python is "+fees.get("python"));
		
		//iterate over all the values
		//keySet() which will return a Set of Keys
		Set<String> keys = fees.keySet();
		System.out.println(keys);
		for(String key : keys) {
			System.out.println(key +" : "+fees.get(key));
		}
		
		//update the value of a key
		fees.put("testing", 10000.00);
		
		System.out.println(fees);
		
		//remove the data
		fees.remove("SAP");
		System.out.println(fees);
		
		fees.remove("testing", 10000.0);
		System.out.println(fees);
		
		
	}

}
