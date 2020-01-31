package stringQuestions;

public class stringPracTwo {

	public static void main(String[] args) {

		String abc = "TestingXperts";
		
		String reverse = "";
		
		for (int i = abc.length()-1 ; i >= 0; i--) {
			
			reverse = reverse + abc.charAt(i);
		}
		
		System.out.println("lets print the reversed string : " + reverse);
		
	}

}
