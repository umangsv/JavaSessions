package inheritanceAssignment;

public class TestUniversity {

	public static void main(String[] args) {
		
		
		// top casting
		University unObj = new Stanford();
		
		// can access public member variables
		String nameOfUniversity = unObj.universityName;
		int univCode = unObj.uniCode;
		
		// cannot access public member variable of a child class with parent reference
		//obj.stanUniCode;
		
		// 
		
		
		// calling overridden methods of Stanford class
		unObj.regularClasses();
		unObj.eveningClasses();
		
		// calling University's own methods, these methods can be accessed with any reference
		unObj.classRoom();
		unObj.playGround();
		
		//parent reference cannot access child's own method
		//obj.specialSessions();
		
		// down casting will throw compiler error
		// Stanford stan = new University();
		
		Stanford stan = new Stanford();
		// we will be able to access parent's class methods form child class reference
		stan.classRoom();
		stan.playGround();
		
		// accessing our own methods 
		stan.specialSessions();
		stan.PHDCourse();
		stan.DualDegreeCourse();
		
		//can access stanUniCode only through child's reference NOT with Parent reference
		int code = stan.stanUniCode;
		
		
		
		University obj1 = new MIT();
		obj1.regularClasses();
		obj1.eveningClasses();
		
		// calling static and final methods of University Class
		
		University.testStatic();
		unObj.testFinal(); // University unObj = new Stanford();
		
	
		

		

		
	}

}
