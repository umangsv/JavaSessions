package lexInfosysPractise;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "This is my java code and I am so happy so much";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(0));
		//System.out.println(str.charAt(38));//StringIndexOutOfBoundsException
		
		System.out.println(str.indexOf("m"));
		System.out.println(str.indexOf("java")); 

		System.out.println("finding index of Hello : " +str.indexOf("hello")); // since java is not present, it will return -1
		
		System.out.println(str.indexOf("s"));//1st occurrence of s
		System.out.println(str.indexOf("s", str.indexOf("s")+1));//2nd occurrence of s
		
		System.out.println("==========================");
		System.out.println(str.indexOf("o"));
		System.out.println(str.indexOf("o", str.indexOf("o")+1));
		System.out.println("==========================");
		
		String mesg = "Welcome null";
		if(mesg.indexOf("Admin")>0){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
		
		System.out.println(str.indexOf('h'));
		
		//compare Strings:
		String s1 = "Hello World";
		String s2 = "hello World";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//trim:
		String p = "     hello world     ";
		System.out.println(p.trim());
		
		//replace:
		System.out.println(p.trim().replace(" ", ""));
		
		String dob = "01-01-1990"; //01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		//UCASE and LCASE:
		String h1 = "This is Selenium";
		System.out.println(h1.toLowerCase());
		System.out.println(h1.toUpperCase());
		
		//sub string:
		String st = "Transaction id is 1234";
//		System.out.println(st.substring(5)); // returns == action id is 1234
//		System.out.println(st.substring(0, 12)); // returns == transaction 
//		System.out.println(st.substring(18)); // returns == 1234
		
//		System.out.println(st.indexOf("is")+3); // returns 18
//		System.out.println(st.charAt(18)); // returns 1
//		System.out.println(st.substring(st.indexOf("is")+3, st.length())); // returns 1234, it cuts the string 1234 from st using substring (start,end) indexes
//		System.out.println(st.substring(st.indexOf("1234"), st.length()));
		
		
		//split:
		String data = "Tom;25;male;1000;USA";
		String dataVal[] = data.split(";");
		
		System.out.println(dataVal[3]);
		
		for(int i=0; i<dataVal.length; i++){
			System.out.println(dataVal[i]);
		}
		
		String test = "xXJavaXxXPythonxXRubyxXSelenium";
		String val[] = test.split("xX");
		System.out.println(val[0]);  // at zero index, there is nothing but an Empty String since xX was present in the beginning and it cut the string from there 
		System.out.println("==========================");
		for (String string : val) {
			System.out.println(string);
		}
		System.out.println("==========================");
		
		String name = "Tom Peter Steve";
		
		// instead of storing the split into String array, we can directly fetch the single split value like below
		System.out.println(name.split(" ")[0]);
		System.out.println(name.split(" ")[1]);
		System.out.println(name.split(" ")[2]);

		// split single values using for loop
		
		System.out.println("==========================");
		for(int i=0; i<name.split(" ").length; i++){
			System.out.println(name.split(" ")[i]);
		}
		System.out.println("==========================");
		String credentials = "admin;testpassword";
		String username = credentials.split(";")[0];
		String password = credentials.split(";")[1];
		System.out.println("==========================");
		doLogin(username, password);
	}
	
	public static void doLogin(String un, String pwd){
		System.out.println("login to app with "+ un + " "+ pwd);
		
		
		String s2 = "!@#$%%^umangsharma!@&&*&@(";
		
		s2 = s2.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s2);
		
		
		
	}

}
