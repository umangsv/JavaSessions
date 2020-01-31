package ConstructorAssignment;

import java.util.ArrayList;
import java.util.Date;

public class TestClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		University uni = new University("Punjabi Univ, Patiala", "India", new Date(1987,21,11), new ArrayList<String>() {
							{
								add("IT");
								add("Electronics");
								add("Mechanical");
								add("ComputerScience");
							}
						}
		);
		
		
	    University uni1 = new University("Kurukshetra Univ", "Kurukshetra, India");
		
		System.out.println(uni1.getName());
		System.out.println(uni1.getCountry());
		System.out.println(uni1.getCoursesList());
		System.out.println(uni1.getEstablishedDate());
		
		System.out.println("==========================================");
		
		System.out.println("Name of Univ is : " + uni.getName());	
		System.out.println("Name of Country is : " + uni.getCountry());
		System.out.println("Date of Establishment : " + uni.getEstablishedDate());
		System.out.println("List of Courses : " + uni.getCoursesList());
		
//		uni.getEstablishedDate();
//		uni.getCoursesList();

		
	}

}
