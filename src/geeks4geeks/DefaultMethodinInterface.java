package geeks4geeks;

interface in2 
{ 
    final int a = 10; 
    default void display() 
    { 
        System.out.println("hello"); 
    } 
} 

interface in3
{
	int a = 20;
	
	static void display()
	{
		System.out.println("Inside in3");
	}
	
}
  
// A class that implements interface. 
class DefaultMethodinInterface implements in2 , in3
{ 
    // Driver Code 
    public static void main (String[] args) 
    { 
    	DefaultMethodinInterface t = new DefaultMethodinInterface(); 
        t.display(); 
        
        // static method can be called thru interface name directly
        in3.display();
        
    } 
} 