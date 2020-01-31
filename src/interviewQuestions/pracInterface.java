package interviewQuestions;

interface maths {

	void calculateSum(int a, int b);

	void calculateProduct(int a, int b);
	
	public static final	int a =10; // this is called constants as all the fields are public, static and final in nature
	
	int b = 100; // color is turning to blue indicating a constant variable.

	
}

 class ABC implements maths {

	 int c = 200;  /// notice that the color does not turn blue here in this class
	 static int d = 300; // notice that after declaring the variable as static, variable color turns blue indicating constant value
	 
	 
	 
	@Override
	public void calculateSum(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateProduct(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	
}

public class pracInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
