package inheritanceAssignment;

public class NYU extends University{
	
	@Override
	public void regularClasses() {
		
		System.out.println("NYU - regularClasses");
	}
	
	@Override
	public void eveningClasses() {
		
		System.out.println("NYU - eveningClasses");
	}
	
	public void specialSessions() {
		
		System.out.println("NYU - specialSessions");
	}
	
	public void PHDCourse() {
		
		System.out.println("NYU - PHDCourse");
	}
	
	public void DualDegreeCourse() {
		
		System.out.println("NYU - DualDegreeCourse");
	}
}
