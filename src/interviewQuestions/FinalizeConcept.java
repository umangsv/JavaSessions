package interviewQuestions;

public class FinalizeConcept {

	//Called by the garbage collector on an object when garbage collection 
	//determines that there are no more references to the object
	
	
	public void finalize() {
		System.out.println("this will be called before System.gc method");
	}
	
	
	public static void main(String[] args) {

		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
	//	f2 = null;
		
		System.gc();
		
		
	}

}
