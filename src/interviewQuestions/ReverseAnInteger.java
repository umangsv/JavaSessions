package interviewQuestions;

public class ReverseAnInteger {

	public static void main(String[] args) {

		int num = 102201;
		int rev = 0;
		
		
		// 1. using algorithm
		while (num!=0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		
		System.out.println("Reverse of an integer is : " + rev);
		
		//2. using methods
		
		int num2 = 12345;
		
		String str = new StringBuffer(String.valueOf(num2)).toString();
		System.out.println(str);
		
		System.out.println(new StringBuffer(String.valueOf(num2)).reverse());
		System.out.println();
		
		
	}
	
	
	

}
