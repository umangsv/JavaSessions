package stringQuestions;

public class concatenateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Sachin";
		s.concat("Tendulkar");// concat() method appends the string at the end
		System.out.println(s);// will print Sachin because strings are immutable objects

		// s is stored in the heap memory in the string constant pool .
		// it will be on the heap memory

		String s2 = "Sachin";
		s2 = s2.concat(" Tendulkar");
		System.out.println(s);
		
		// In such case, s points to the "Sachin Tendulkar". Please notice that still sachin object is not modified.
		
		// https://www.geeksforgeeks.org/difference-equals-method-java/
		// https://www.javatpoint.com/immutable-string
	}

}
