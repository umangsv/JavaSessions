package JavaPractise;

public class ArrayPractise {

	public static void main(String[] args) {

	/*	Printing of below series
		00 01 02 03 04 05 06 07 08 09 
		10 11 12 13 14 15 16 17 18 19 
		20 21 22 23 24 25 26 27 28 29 
		30 31 32 33 34 35 36 37 38 39 
		
	*/
		
		for (int i = 0; i < 40; i++) {	
			
			if(i<=9)
			{
				System.out.print("0");
			}
			
			
			System.out.print(i);
			System.out.print(" ");
			
			if(i>1 && i%10==9)
			{
				System.out.println();
			}
		}
		
		System.out.println();
		
		
		
		
	}

}
