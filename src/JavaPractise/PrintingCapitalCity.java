package JavaPractise;

import java.util.Scanner;

public class PrintingCapitalCity {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		String x[] = {"India", "Pakistan","SriLanka", "Bangladesh", "Russia"};
		String y[] = {"New Delhi", "Islamabad", "Colombo","Dhaka", "Moscow" };
		System.out.print("Enter The Country Name = ");
		
		String in = obj.nextLine();
		
		int j = 0;
		
		for (int i = 0; i<=4; i++) {
			
			if(in.equalsIgnoreCase(x[i]))
			{
                System.out.println(y[i]);
                j=5;
                i=5;
			}
			
		}
		
		if(j<5)
        {
            System.out.println("This Country Not Available");
        }
		
		
		
	}

}
