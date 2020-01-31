package interviewQuestions;

public class ThirdOccurence {

	public static void main(String[] args) {

		String str = "The rains have started here selenium";
		
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(8));
		
		System.out.println(str.indexOf("s"));
		
		// second occurance
		System.out.println(str.indexOf("s", str.indexOf("s")+1));
		
		System.out.println("================= third occurrence ============");
		// third occurance 
		int indexNo = str.indexOf("s",str.indexOf("s")+1);
		System.out.println("index for second occurrence : " + indexNo);
		
		System.out.println(str.indexOf("s", str.indexOf("s", str.indexOf("s")+1)+1));
		// to make it more simpler
		
		System.out.println(str.indexOf("s",str.indexOf("s", indexNo + 1)));
		
		System.out.println("================= third occurrence end ============");
		
		
		// index of string 
		System.out.println(str.indexOf("have"));
		
		// index of hello - will RETURN -1
		System.out.println(str.indexOf("hello"));
		
		// substring 
		// Remember, substing method mein ending Index + 1 karna hai 
		System.out.println("=================");
		System.out.println(str.indexOf("e", str.indexOf("s")+1));
		System.out.println(str.substring(10, 14));
		
		// trim and replace
		System.out.println(str.trim());
		System.out.println(str.replace(" ", "*"));
		
		// split
		
		System.out.println("=================");
		String test = "Hello_World_Test_Selenium";
		
		String strArray[] =  test.split("_");
		
		for (String string : strArray) {
			System.out.println(string);
		}
		
		// directly getting a splitted value using index
		System.out.println(test.split("_")[3]);
		
		// concatenation
		System.out.println(str.concat(" Preperation"));
		
		// interview question
		
		String x = "Hello";
		String y = "World";
		
		int a = 100;
		int b = 200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+(a+b));
		
		// removing junk chars
		String junk = "ae@io#b$u123";
		
		System.out.println(junk.replaceAll("[^a-zA-Z0-9]", ""));
		
		// fetching special chars
		System.out.println(junk.replaceAll("[a-zA-Z0-9]", ""));
		
		// finding number of occurences of l in Googllllleee
		System.out.println("=================");
		String google = "Googllllleee";
		
		int firstIndex = google.indexOf("l");
		System.out.println(firstIndex);
		
		int lastIndex = google.lastIndexOf("l");
		System.out.println(lastIndex);
		
		int counter = 0;
		
		for (int i = firstIndex; i <= lastIndex; i++) {
			
			if(google.charAt(i)=='l')
			counter++;
		}
		
		System.out.println("Counter value is : " + counter);
		
	}

}
