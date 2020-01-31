package interviewQuestions;

public class SwappingIntegers {

	public static void main(String[] args) {

		// 1. by using third variable
		
		int x = 5;
		int y = 10;
		// x = 10, y = 5
		
//		int temp ;
//		temp = x; // temp =5
//		x = y; // x = 10
//		y = temp; // y = 5
//		System.out.println(x + " " + y );
		
		
		// 2. without using third variable USING + operator
		
//		x  = x + y; // x=15
//		y  = x - y ; // y = 15 - 10 which is 5, and hence y is swapped successfully at this point.
//		x = x - y; // x = 15 - 5, which is 10, and hence x is swapped also at this point.
//		System.out.println( x + " and " + y);
		
		
		//3. using multiply
		
		x = x * y ; // x = 5 *10 = 50
		y = x / y ; // y = 50 / 10 = 5
		x = x / y;  // x = 50 / 5 = 10
		System.out.println( x + " and " + y);
		
		// 4. using XOR 
		
		// bitwise conversion x = 0101,  y = 1010
		
//		x = x ^ y;  // 15 --> 1111
//		y = x ^ y;  // 10 --> 1010
//		x = x ^ y;  // 5  --> 0101
//		
//		System.out.println(x + " and "  + y );
	}

}
