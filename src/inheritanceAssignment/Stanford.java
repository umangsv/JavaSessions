package inheritanceAssignment;

public class Stanford extends University {

	public int stanUniCode ;
	
	@Override
	public void regularClasses() {
		
		System.out.println("Stanford - regularClasses");
	}
	
	@Override
	public void eveningClasses() {
		
		System.out.println("Stanford - eveningClasses");
	}
	
	public void specialSessions() {
		
		System.out.println("Stanford - specialSessions");
	}
	
	public void PHDCourse() {
		
		System.out.println("Stanford - PHDCourse");
	}
	
	public void DualDegreeCourse() {
		
		System.out.println("Stanford - DualDegreeCourse");
	}
	
	// final methods CANNOT be overridden
	// static methods CANNOT be overridden
	
//	@Override
//	public void test() {
//		
//		System.out.println("Stanford - test final method can be overridden or not");
//	}
	
//	@Override
//	public void testStatic() {
//		System.out.println("Stanford - test static method can be overridden or not");
//	}
	
}
