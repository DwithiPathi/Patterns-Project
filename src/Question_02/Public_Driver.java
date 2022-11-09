package Question_02;



public class Public_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  
			      PublicA a = new PublicA();   // Animal reference and object
			      PublicA b = new PublicB();   // Animal reference but Dog object
			      a.move();   // runs the method in Animal class
			      b.move();   // runs the method in Dog class
			 }
			

	}


