package exceptionHandling;

public class ThrowConcept {

	public static void main(String[] args) {

		try {
			throw new Exception("This is my exception");
		} catch (Exception e) {
			e.printStackTrace();
		}

		String colValue = null;
		if (colValue == null) {
			try {
				throw new Exception("ColumnValueNotFoundException");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		//No exception of type int can be thrown; an exception type must be a subclass of Throwable
//		try {
//	         throw 10;
//	      }
//	      catch(int e) {
//	         System.out.println("Got the  Exception " + e);
//	      }
		

	}

}