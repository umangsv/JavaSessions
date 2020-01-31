package stringQuestions;

public class stringPractise {

	public static void main(String[] args) {


//		String s = "Sachin";
		
		String s1 = "Sachin";
		String s2 = "Tendulkar";
		
		System.out.println(s1.concat(s2));
		
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		if(s1==s2)
		{
			System.out.println("inside if condition");
		}
		
		else
		{
			System.out.println("here, we are comparing references of s1 and s2");
			System.out.println("since both references point to different memory location, so we are in else condition");
			System.out.println("inside else condition");		
		}
		
		System.out.println("=====================");
		
		String a = "Testing";
		a = "Experts";
		
		System.out.println("value of a is : " + a);
		
		
		
		
		
	}

}
