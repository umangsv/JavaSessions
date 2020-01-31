package interviewQuestions;

public class LargestNumInArray {

	public static void main(String[] args) {
		
		int arr[] = {1,5,6,7,8,9,0,90};
		
		int max = arr[0]; // assign  max value to number at index zero
		
		
		// in for loop, assign the value to max
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i]>max)
			{
				max = arr[i];
			}
			
		}
		
		System.out.println("Greatest number is : " + max);
		
		
	}

}
