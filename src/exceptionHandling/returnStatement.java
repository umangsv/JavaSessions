package exceptionHandling;

public class returnStatement {

	public static void main(String[] args) {

	
	int checkValue = Calculate.checkReturn();
		
	System.out.println(checkValue);

	}
	
	
	public static class Calculate{
		
		
		public static int checkReturn() {
			
			
			try {
				
				return 10;
			} finally {
				
				System.out.println("inside finally block");
				return 20;
			}
			
		}
		
		
		// whatever finally block with return, that will be the final return value
		
		
	}
	
	
		
	

}
