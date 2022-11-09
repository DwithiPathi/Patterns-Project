package Question_10;

public class SubClass extends SuperClass {
	private double length;
	   /**
	    *  Sets length, width and height
	    */
	   public void setSubClass(double height,double weight,double length)
	   {
	      setSuperClass(height, weight);
	      this.length  = length; 
	   }
	   /** 
	    * The toString method overrides toString method
	    * and returns length, weight and height string
	    */
	   public String toString()
	   {
	      return super.toString() + "\nLength : " + length;
	   }
}
