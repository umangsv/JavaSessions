package JavaPractise;

import java.util.Scanner;

public class ConditionalOperatorAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a =198;
//		int b =20;
//		int c =99;
//		
//		
//		if( a> b && a>c)
//		{
//			
//			System.out.println(" a is greatest ");
//		}
//		
//		else if( b> a && b>c)
//		{
//			
//			System.out.println(" b is greatest ");
//		}
//		
//		else
//		{
//			System.out.println(" c is greatest");
//		}
		
		
		// program to find greatest of 3 no.s 
		
		int x, y, z;
		System.out.println("Enter 3 no.s");
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		if(x>y && x>z)
		{
			System.out.println("First number is largest.");
		}
		
		else if( y>x && y>z)
		{
			
			System.out.println(" b is greatest ");
		}
		
		else if (z>x && z>y)
		{
			System.out.println(" c is greatest");
		}
		
		else 
		{
			System.out.println(" no.s are not distinct");
		}
		
//		String names[] = new String[3];
//		
//		names[3] = "Umang";
//		names[4] = "Sharma";
//		
//		System.out.println(" let's print " + names[3]);
		
		//
	
		
	}

}
