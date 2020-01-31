package geeks4geeks;


interface in1 
{ 
    // public, static and final 
     int a = 10; 
     String abc = "umang";
  
     
    // public and abstract  
    void display(); 
} 

public class GeeksForGeeksInterfaces implements in1{

	@Override
	public void display() {
		
		System.out.println("Geek");
	}
	
	 public static void main (String[] args) 
	    { 
		 GeeksForGeeksInterfaces t = new GeeksForGeeksInterfaces(); 
	        t.display(); 
	        
	        // different ways of accessing a 
	        
	        System.out.println(a); 
	        System.out.println(t.a);
	        System.out.println(in1.a);
	    } 
	 
	 /*
	  
	  Important points about interface or summary of article:

We can’t create instance(interface can’t be instantiated) of interface but we can make reference of it that refers to the Object of its implementing class.
A class can implement more than one interface.
An interface can extends another interface or interfaces (more than one interface) .
A class that implements interface must implements all the methods in interface.
All the methods are public and abstract. And all the fields are public, static, and final.
It is used to achieve multiple inheritance.
It is used to achieve loose coupling.
	  
	  */
	
}
