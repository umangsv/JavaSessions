package stringQuestions;

public class appendMethod {

	public static void main(String[] args) {

		StringBuffer sf = new  StringBuffer("today is friday");
		
		sf.append(" lets go outside");
		
		System.out.println(sf);
		
		// string 
		
		//String object is slower in performance whereas, the StringBuffer object is faster. 
		//String object consumes more memory whereas, StringBuffer objects consumes less memory. 
		//String objects are stored in a constant pool whereas, StringBuffer objects are stored on heap memory
		
	}

}
