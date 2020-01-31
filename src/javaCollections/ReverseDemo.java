package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myList = new ArrayList<String>();
		myList.add("umang");
		myList.add("chuha");
		myList.add("ok");
		myList.add("yes");
		
		System.out.println(myList);
				
		Collections.reverse(myList);
		
		System.out.println(myList);
		
		
		List<Integer> intList = new ArrayList<Integer>();
		
		
	}

}
