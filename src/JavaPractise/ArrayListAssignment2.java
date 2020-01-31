package JavaPractise;

import java.util.ArrayList;

public class ArrayListAssignment2 {

	public static void main(String[] args) {
	
		
		// program to add element into array list at first and last position
		ArrayList<String> arr = new ArrayList<>();
	
		arr.add("first");
		arr.add("second");
		arr.add("third");
		arr.add("fourth");
		
		int sizeArr = arr.size();
		
		// adding element at a specific position
		arr.add(0, "zero");
		
		
		
		// adding element at last position
		arr.add(sizeArr+1, "last");
		

		for (String string : arr) {
			
			System.out.println(string);
		}
		
		System.out.println();
		
		
		// updating a specific array element by given element , 2 is the index below
		arr.set(2, "chuha");
		
		for (String string : arr) {
			
			System.out.println(string);
		}
		
	}

}
