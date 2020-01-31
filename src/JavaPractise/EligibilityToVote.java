package JavaPractise;

import java.util.Scanner;

public class EligibilityToVote {

	public static void main(String[] args) {
		
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's ur age? ");
		
		age =  sc.nextInt();
		
		if (age>=18)
		{
			System.out.println("You are eligible to vote.");
		}
		
		else
			System.out.println("You are not eligible to vote");
		
		
		
	}

}
