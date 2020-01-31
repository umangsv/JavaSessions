package JavaPractise;

public class LoopsPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int i = 0; i < 6; i++) {
//			
//			System.out.println("I am Batman");
//		}
		
//		for (int i = 0; i < 10; i++) {
//			
//			System.out.println(" I am Batman " + i);
//		}
		
		// reverse print from 10 to 1
		
//		for (int i = 10; i > 0; i--) {
//			
//			System.out.print(i);
//		}
//		
//		System.out.println();
//		// reverse print using while loop
//		
//		int i=10;
//		
//		while (i>0) {
//			System.out.print(i);
//			i--;
//		}
//		
//		System.out.println();
//		
//		int j=10;
//		
//		do {
//			
//			System.out.print(j);
//			j--;
//			
//		} while (j>0);
//		
//		
//		int k =10;
//		
//		while (k>0) {
//			
//			System.out.println("Hello World");
//			k--;
//			
//		}
		
		
		// print sequence but quit on encounter of multiple of 7
		for (int i = 1; i < 11; i++) {	
			
			if(i%7==0) {
				break;
			}
			System.out.println(i);
		}
		
		// using while loop
//		int l= 1;
//		while (l<10) {
//			
//			if(l%7==0)
//			{
//				break;
//			}
//			
//			System.out.println(l);
//			
//			l++;
//		}
		
		
		for (int z = 4; z >=0; z--) {
			
			System.out.println(" n = " + z);
		}
		
	}

}
