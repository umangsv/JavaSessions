package interviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String names[] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java", "Ruby" };
		
		//1. compare each element with every other element
		// due to time complexity ( on2) , this is not a good solution
		
//		for (int i = 0; i < names.length; i++) {
//			
//			for (int j = i+1; j < names.length; j++) {
//				
//				if(names[i].equals(names[j]))
//				{
//					System.out.println("Duplicate element is : " + names[i]);
//				}
//				
//			}
//		}
//		
		
		//2. using hashset - Java Collection and it stores unique values
		// time complexity (on) in this case, so better solution
		
		
		// Set is an Interface and HashSet is a class.
		// so here, HashSet is implementing Set Interface
		
		// set method store.add("") will return true for the first time but WILL RETURN FALSE the second time.
		
//		Set<String> store = new HashSet<String>();
//		
//		System.out.println("let's check what this returns 1 time: "  + store.add("Java"));
//		System.out.println("let's check what this returns 2 time : "  + store.add("Java"));
//		
//		for (String name : names) {
//			
//			if(store.add(name) == false)
//			{
//				System.out.println("Duplicate value is : " + name);
//			}
//		}
//		
//		System.out.println("============================");
//		
		
		// 3. using HashMap
		// time complexity , O(2n)
		// names[] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java", "Ruby" };

		
		// Logic to solve this is if they key does not exist before adding, it will return null,
		// if key is already existing, it will NOT return NULL
		
		Map<String,Integer> storeMap = new HashMap<String,Integer>();		
		
		System.out.println(storeMap.put("Java", 1));
		System.out.println(storeMap.put("Java", 1));
		
		
		for (String name : names) {

			if(storeMap.put(name, 1) != null)
			{
				System.out.println("Duplicate name is : " + name);
			}
			
		}

		
		

	}

}
