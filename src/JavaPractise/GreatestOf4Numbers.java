package JavaPractise;

public class GreatestOf4Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 1, b = 6, c = 33, d = 14;
	   
		int max, max3;
	    
		// Find the greater number in a or b
	
		max = (a > b? a : b);  //6
	    
		System.out.println(" max of a & b is " + max);
		
		/* Find the greater number in c and d, and compare to the previously
	       found maximum in a and b. */
		
		int max1 = (c>max? c:max); // 33
		
		int max2 = (d>max? d:max); //14
		
		System.out.println(" value of max1 " + max1);
		
		System.out.println(" value of max2 " + max2);
		
		max3 = (c > d ? max1: max2);
		
		System.out.println(" value of max3 = " + max3);
		
		
//		max = (c > d? (c > max? c : max) : (d > max? d : max));
//	    
//	    System.out.println(" max value out of 4 nums is = " + max);
	   
	}

}
