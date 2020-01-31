package lexInfosysPractise;

public class StringManipulation2 {

	public static void main(String[] args) {

		
		String abc = "!@#%^#*(#()))abcdef123~~~~~:?";
		
		abc = abc.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(abc);
		
	}

}
