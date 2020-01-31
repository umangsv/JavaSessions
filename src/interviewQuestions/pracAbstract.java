package interviewQuestions;

abstract class Apple {

	abstract void methodApple();

	public void nonAbstractMethod() {
		System.out.println("inside the abstract class method");
	}

}

class Ball extends Apple {

	@Override
	void methodApple() {

		System.out.println("let's print something inside B");

	}
	
	public void ballMethod() {
		System.out.println("personal method of class Ball ");
	}

}

public class pracAbstract {

	public static void main(String[] args) {

		Apple app = new Ball();
		app.methodApple();
		
		app.nonAbstractMethod();
		// app.ballmethod(); // this method will give compile error i.e. cannot access child specific method using parent class ref
		
		
		Ball ball = new Ball();
		ball.ballMethod(); // can call its own personal method
		
		
		
	}

}
