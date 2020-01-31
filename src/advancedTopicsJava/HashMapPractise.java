package advancedTopicsJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapPractise {

	public static void main(String[] args) {

		HashMap<String,String> hm = new HashMap<String,String>();
		
		//hm.put("101", "Umang");
		hm.put("102", "Chuha");
		hm.put("103", "Adhish");
		hm.put("104", "Swati");
		hm.put("105", "Guggu");	
		hm.put("106", "Ribzoo");
		hm.put("106", "Ribzz");
		
		// it will print all values added in hashmap
		// it does not store values in order or sequence
		System.out.println("======================");
		System.out.println(hm.put("101", "India"));
		System.out.println("======================");
		System.out.println(hm.get("101"));
		System.out.println("======================");
		//
		System.out.println("Let's print the object :  " + hm);
		
		// to fetch the value using a particular key, use the Get method
		String value = hm.get("105");
		System.out.println(value);
		
		// asking value for wrong key will return value as null
		System.out.println(hm.get("10001"));
		
		for (Entry<String, String> data : hm.entrySet() ) {
			
			System.out.println("Key from Map is : " + data.getKey()  + " and Value is " + data.getValue());
		}
		
		// interesting concept of PUT method ( its return values)
		int arr[] = {2,2,4,6,7,6,9,9};
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		
	//	System.out.println("let's check it out : " + map.put(2, 2));
		
		
		// concept is , if map.put returns null, it means there's no mapping to the corresponding key
		// if map.put does not returns null, it means mapping existed before and will not return null.
		for (int num : arr) {
			
			if(map.put(num, num)!=null)
			{
				System.out.println("Duplicate using Hashmap is : " + num);
			}
		}
		
	}

}
