package Question_18;

public class ImplementsRunnable implements Runnable {
	String msg;
	ImplementsRunnable(String s){
		msg=s;
		System.out.println("Hi");
	}
	public void run() {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementsRunnable obj1=new ImplementsRunnable("hello");
		ImplementsRunnable obj2=new ImplementsRunnable("world");
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		//To call the run() method, start() method is used
		t1.start();
		t2.start();
	

	}

}
