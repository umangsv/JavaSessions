package JavaPractise;

public class MethodsAssignment {

	public int AddingTwoNumbers(int a, int b)
	{
		int c = a + b;	
		return c;
	}
	
	public double MultiplyTwoNumbers(double a, int b)
	{
		double c = a * b;	
		return c;
	}
	
	public double CalculateCircumference(int rad)
	{
		return (3.142 * rad * rad);
	}
	
	public int MaximumOfThreeNums(int a, int b, int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		
		else if (b>a && b>c)
		{
			return b;
		}
		
		else 
		{
			return c;
		}
	}
	
	public int MinOfThreeNums(int a, int b, int c)
	{
		if(a<b && a<c) {
			return a;
		}
		
		else if ( b<a && b<c )
		{
			return b;
		}
		
		else {
			return c;
		}
	}
	
	public boolean CheckPrimeNumber(int a) {
		
		if( a == 2 || a == 3 || a == 5 || a == 7 || a == 11)
		{
			return true;
		}
		
		
		if(a%2 == 0)
		{
			return false;
		}
		
		else if (a%3 == 0)
		{
			return false;
		}
		
		else if (a%5 == 0)
		{
			return false;
		}
		
		else if (a%11 == 0)
		{
			return false;
		}
		
		else if ( a == 0 || a == 1)
		{
			return false;
		}
		
		return true;
		
	}
	
	
	public int factorial(int fact) {
		
		int num = fact;
		
		for (int i = fact; fact > 1; fact--) {

			 num = num * (fact-1);
		}
		
		return num;
	}
	
	public static void testStaticMethod()
	{
		System.out.println("Calling directly using Class Name");
	}
	
	public static void main(String[] args) {
	
		MethodsAssignment obj = new MethodsAssignment();
		double d = obj.MultiplyTwoNumbers(20.2, 30);
//		System.out.println("Product of two numbers : " + d);
//		
//		System.out.println("Addition of two numbers :" + obj.AddingTwoNumbers(10, 20));
//		
//		System.out.println("Circumference of Circle :" + obj.CalculateCircumference(10));
//		
//		System.out.println("Max of 3 no.s is : " + obj.MaximumOfThreeNums(10, 20, 30));
//		
//		System.out.println("Min of 3 no.s is : " + obj.MinOfThreeNums(8, 2, 10));
		
//		System.out.println("Prime no check :" + obj.CheckPrimeNumber(23));
		
		System.out.println("factorial of a number : " + obj.factorial(6));
		
		MethodsAssignment.testStaticMethod();
		
	}

}
