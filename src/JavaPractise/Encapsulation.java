package JavaPractise;

public class Encapsulation {

	public String name;
	public int age;
	private int accountNumber;
	private int salary;
	
	public static void main(String[] args) {
		
	 Encapsulation obj = new Encapsulation();
	 obj.name = "Umang";
	 obj.age = 32;
	 
	 obj.setAccountNumber(123456);
	 obj.setSalary(20000);
	 
	 System.out.println(" This is account num : " + obj.getAccountNumber());
	 System.out.println(" This is salary : " + obj.getSalary());	
		
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
