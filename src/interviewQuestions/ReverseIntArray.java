package interviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class ReverseIntArray {

	public static void main(String[] args) {

		Integer[] arr = {10,20,30,40,50};
		
		reverseMethod(arr);
		
	}
	
	
	public static void reverseMethod(Integer[] arr) {
		
		Collections.reverse(Arrays.asList(arr));
		
		System.out.println(Arrays.asList(arr));
		
		System.out.println(arr);
		
		for (Integer integer : arr) {
			System.out.println(integer);
		}
	}

}
