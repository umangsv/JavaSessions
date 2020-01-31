package interviewQuestions;

public class StringSwap {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "World";
		
		System.out.println("Before Swapping");
		System.out.println("Value of a is : " + a );
		System.out.println("Value of b is : " + b );
		
		// 1. append a and b
		
		a = a+b ; // HelloWorld
		
//		b = a.substring(0, a.length()-b.length()); // b = HelloWorld - Hello 
//		
//		a = a.substring(b.length());  // fetching the value from HelloWorld by using substring with beginning index - end of Hello
//		
//		System.out.println(a + " and " + b);
		
		
		// 2. second method
		
		String s1 = "Hello";
		String s2 = "World";
		
		s1 = s1 + s2; // s1 = HelloWorld
		
		s2 = s1.replace(s2, ""); // s2 = HelloWorld mein se World dhoond ke usko "" blank string se replace kardia
		
		s1 = s1.replace(s2, ""); // s1 = HelloWorld mein se Hello hatana hai, toh HelloWorld - s2 (which is Hello now) and blank string se replace kar dia
		
		System.out.println(s1 + " and " + s2);
		
		
	}

}
