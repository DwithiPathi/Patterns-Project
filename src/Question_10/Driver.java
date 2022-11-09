package Question_10;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		double height, weight, length;
	      Scanner console = new Scanner(System.in);
	      // Get the height 
	      System.out.print("Enter the length of box : ");
	      height = console.nextDouble();
	      // Get the weight 
	      System.out.print("Enter the width of box : "); 
	      weight = console.nextDouble();
	      // Get the length 
	      System.out.print("Enter the height of box : ");
	      length = console.nextDouble();
	      // Create object.
	      SubClass obj = new SubClass();
	      // Set the length, width and height of box.
	      obj.setSubClass(height, weight, length);
	      System.out.println(obj);
	}

}
