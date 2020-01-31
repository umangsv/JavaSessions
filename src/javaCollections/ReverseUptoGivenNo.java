package javaCollections;

public class ReverseUptoGivenNo {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6};
		
		int n = arr.length;
		
		int k = 4;
			
		reverse(arr, k);
		
		for (int i : arr) {
			System.out.print(i + " ") ;
		}
		
		System.out.println();
		
		System.out.println("end  of program ");
		
	}
	
	
	public static void reverse(int[] arr, int k ) {
		
		int tempSwap ;
		
		for (int i = 0; i < k/2; i++) {
			
			tempSwap = arr[i];  // 2
			arr[i] = arr[k-i-1]; //3
			arr[k-i-1] = tempSwap; // 2
		}
		
		
		
	}

}
