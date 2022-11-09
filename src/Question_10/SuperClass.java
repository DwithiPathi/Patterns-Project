package Question_10;

public class SuperClass {
	 private double height;
	 private double weight;
	   public void setSuperClass(double height, double weight)
	   {
	      this.height = height;
	      this.weight  = weight; 
	   }

	   /**
	    * Returns length and weight as string
	    */
	   public String toString()
	   {
	      return "height : " + height + "\nWeight : " + weight;
	   }
}
