package Question_02;

public class Default {
	// Java program to demonstrate the case
	// when two interfaces are overridden
	 
	// Creating Interface One
	interface GfG{
	   public default void display()
	   {
	      System.out.println("GEEKSFORGEEKS");
	   }
	}
	 
	// Creating Interface Two
	interface gfg{
	 
	   public default void display()
	   {
	      System.out.println("geeksforgeeks");
	   }
	}
	 
	public class InterfaceExample implements GfG,gfg {
	 
	// Interfaces are Overrided
	public void display() {
	   
	      GfG.super.display();
	      
	      gfg.super.display();
	   }
	}
}
