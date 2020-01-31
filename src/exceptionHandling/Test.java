package exceptionHandling;

public class Test extends Exception  {

	public static void main(String[] args) {

		try {
			
			throw new Test();
			
		} catch (Test t) {
			
			System.out.println("Inside Catch Block");
		}
		finally {
			
			System.out.println("Inside Finally Block");
			
		}
		
		
		//No exception of type Test can be thrown; an exception type must be a subclass of Throwable
		
	}

}
