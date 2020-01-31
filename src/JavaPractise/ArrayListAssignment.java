package JavaPractise;

import java.util.ArrayList;

public class ArrayListAssignment {

	public static void main(String[] args) {
		 
		
		ArrayList list = new ArrayList();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		
		
		System.out.println(list);
		
		// to get size of array list
		System.out.println(list.size());
		
		// to print a particular value using index
		
		System.out.println(list.get(5));
		
		// this will throw exception of index out of bounds
		//System.out.println(list.get(6));
		
		// remove a particular element from a list using index
		list.remove(2);
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("guggu");
		names.add("chuha");
		names.add("munakokni");
		
		
		ArrayList<Integer> EmpAge = new ArrayList<Integer>();
		EmpAge.add(1);
		EmpAge.add(24);
		EmpAge.add(30);
		
		//  System.out.println(names + " " + EmpAge);
		
		System.out.println( names.get(0)  + " "  +  EmpAge.get(0));
		
		
		// we cannot add a string value in this case
		
		System.out.println("Starting for loop ");
		
		// forward printing an arrayList
		for (int i = 0; i < names.size(); i++) {
			
			System.out.println(names.get(i) + " " + EmpAge.get(i) );
		}
		
		System.out.println();
		
		// reverse printing an arrayList
		
		System.out.println("Starting for Reverse Printing ");
		
		for (int i= names.size()-1 ; i >= 0 ; i--) {
			
			System.out.println(names.get(i));
		}
		
		// advanced for loop :p
		System.out.println();
		
		for (Integer integer : EmpAge) {
			
			System.out.println(integer);
		}
		
		
		System.out.println();
		for (String a : names) {
			
			System.out.println(a);
		}
		
		// printing names using Lambda Expressions
		System.out.println();
		System.out.println("Using Lambda expressions ");
		System.out.println();
		names.forEach((a)-> System.out.println(a));
		
		// printing EmpAge using Lambda Expressions
		System.out.println();
		EmpAge.forEach((b)-> System.out.println(b));
		
		
		
	}

}
