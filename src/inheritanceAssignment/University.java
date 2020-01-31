package inheritanceAssignment;

public class University {
	
	public String universityName;
	
	public static int uniCode;

	public void classRoom()
	{
		System.out.println("University - classRoom");
	}
	
	public void regularClasses() {
		
		System.out.println("University - regularClasses");
	}
	
	public void eveningClasses() {
		
		System.out.println("Univeristy - eveningClasses");
	}
	
	public void playGround() {
		
		System.out.println("University - playGround");
	}
	
	public final void testFinal() {
		
		System.out.println("University - test final method can be overridden or not");
	}
	
	public static void testStatic() {
		System.out.println("University - test static method can be overridden or not");
	}
	
	
	
}
