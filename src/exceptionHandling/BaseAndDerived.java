package exceptionHandling;
class Base extends Exception {}
class Derived extends Base  {}
 
public class BaseAndDerived {
  public static void main(String args[]) {
   // some other stuff
   try {
       // Some monitored code
     //  throw new Derived();
	   
	   throw new Base();
    }
   catch(Derived d)  { 
       System.out.println("Caught derived class exception"); 
    }
    catch(Base b)     { 
       System.out.println("Caught base class exception"); 
    }
   
  }
} 