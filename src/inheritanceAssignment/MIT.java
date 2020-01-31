package inheritanceAssignment;

public class MIT extends University {

	
	@Override
	public void regularClasses() {
		
		System.out.println("MIT - regularClasses");
	}
	
	@Override
	public void eveningClasses() {
		
		System.out.println("MIT - eveningClasses");
	}
	
	public void specialSessions() {
		
		System.out.println("MIT - specialSessions");
	}
	
	public void PHDCourse() {
		
		System.out.println("MIT - PHDCourse");
	}
	
	public void DualDegreeCourse() {
		
		System.out.println("MIT - DualDegreeCourse");
	}
	
	
}
