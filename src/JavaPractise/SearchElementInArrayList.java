package JavaPractise;

import java.util.ArrayList;
import java.util.List;

public class SearchElementInArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("guggu");
		names.add("chuha");
		names.add("munakokni");
		names.add("bhabhi g");
		names.add("bowil");
		names.add("shimlahhh");
		
		
		for (String string : names) {
			
			if(string.contentEquals("chuha"))
			{
				System.out.println(" found chuha ");
			}
			
			if(string.contains("munakokni"))
			{
				System.out.println(" found munakokni ");
			}
			
		}
		
		System.out.println();
		
		// extracting a portion of an ArrayList
		// subList(fromIndex,toIndex
		 List<String> abc = names.subList(1, 3);
		
		for (String string : abc) {
			System.out.println(string);
		}
		
		System.out.println();
		
		// empty an arrayList
		 
		System.out.println("Before Clearing arrayList");
		System.out.println(names);
		
		System.out.println("Clearing arrayList");
		
		// clearing the arrayList values or Emptying an Array
		// names.clear();
		// System.out.println(names);
		
		System.out.println();
		System.out.println("Printing positions of the elements ");
		System.out.println();
		
		// printing using positions of the elements
		
		for (int i = 0; i < names.size(); i++) {
			
			System.out.println(names.get(i));
		}
		
		// swapping two elements in an Array List
		
		//
		
	}

}
