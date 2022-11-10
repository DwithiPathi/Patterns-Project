package Question_22;

public class Immutable_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Dwithi";  
		   s.concat("Reddy");
		   //new object will not create here
		   System.out.println(s);   
		   s =s.concat("Reddy");
		   //new object is created with Dwithi Reddy
		   System.out.println(s);
	}

}
