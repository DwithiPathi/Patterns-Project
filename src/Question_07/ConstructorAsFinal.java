package Question_07;

public class ConstructorAsFinal {
	   public final String name;
	   // Shows compile time error if we use final before constructor
	   // if final keyword removed we get I'am Dwithi Reddy
		  public final ConstructorAsFinal(){
	      this.name = "Dwithi Reddy";
		  }
	   public void display(){
	      System.out.println("I'am  "+this.name );
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      new ConstructorAsFinal().display();
	}

}
