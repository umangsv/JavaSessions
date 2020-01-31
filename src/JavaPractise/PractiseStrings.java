package JavaPractise;

import java.util.Iterator;

public class PractiseStrings {

	public static void main(String[] args) {

		
		// assignment 1
		String str1 = "Umang";
		String str2 = "UmangSharma";
		
		if(str1.equalsIgnoreCase(str2))
			System.out.println("strings are equal");
		else
			System.out.println("strings are un-equal");
		
		if(str1 == str2)
			System.out.println("strings are equal");
		else
			System.out.println("strings are unequal");
		
		System.out.println("==========================");
		
		// assignment 2 - removing all spaces
		String str3 = "I Love LA";
		System.out.println("Removing all spaces in str3 : " + str3.replace(" ", ""));
		
		// assignment 3 - 
		String str4 = "SupriyA";
		
		// char at first index
		System.out.println(str4.charAt(0));
		
		// char at last index of a word
		int index = str4.length();
		
		System.out.println(str4.charAt(str4.length()-1));
		
		// verify a word contains in a sentence
		String sentence = "I want to learn automation";
		
		if (sentence.contains("automation1"))
			System.out.println("word is there");
		else
			System.out.println("word is not there");
				
		// verify a char is present in a sentence 

		// vv imp 
		String msg = "Welcome null";
		
		System.out.println("let's print the index of Admin in msg String : " + msg.indexOf("Admin"));
		
		if(msg.indexOf("e")>=0)
		{
			System.out.println("Passedddd");
		}
		else 
		{
			System.out.println("failed");
		}	
		
		System.out.println(msg.indexOf("W"));
				
	
		// program to reverse your name
		
		String name = "gnamU" ;
//		System.out.println(name.length());
//		System.out.println(name.charAt(4));
		
		for (int i = name.length()-1; i >=0; i--) {
			System.out.print(name.charAt(i));
		}
		
		System.out.println();
		// using StringBuilder 
		
		StringBuilder str = new StringBuilder(name);
		System.out.println(str.reverse());
		
		// program to write last half of the string
		
		String lastHalf = "abcdeFGHIJ";
		int leng = lastHalf.length()/2;
		System.out.println(lastHalf.substring(leng, lastHalf.length()));
		
		
		// program to find third index of a character
		
		String third =	"Welcome to Naveen Automation Lab !";
		System.out.println(third.indexOf("e", third.indexOf("e")+1)); // second index of 'e'
		
		// print the middle string
		String abc = "umang kumar sharma";
		System.out.println(abc.split(" ")[1]);
		
		// if word is not there, index will be returned as -1
		
		System.out.println(abc.indexOf("testing"));
		
		String string = null;
		//System.out.println(string.length());
		
	}

}
