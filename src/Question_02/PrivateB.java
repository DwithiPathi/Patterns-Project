package Question_02;

public class PrivateB extends PrivateA{
	int x,y;
	protected void display(int x,int y) {

		System.out.println("Static or class method from Derived");

		}

		public void print() {

		System.out.println("Non-static or instance method from Derived");

		}
}
