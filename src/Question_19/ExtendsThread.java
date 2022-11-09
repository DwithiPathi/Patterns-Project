package Question_19;

public class ExtendsThread extends Thread {
	String msg;
	ExtendsThread(String s){
		msg=s;
		System.out.println("Hi");
	}
	public void run() {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendsThread obj1=new ExtendsThread("hello");
		ExtendsThread obj2=new ExtendsThread("world");
		//override the run() and then use the start() method to start and run the thread.
		obj1.start();
		obj2.start();
	

	}

}
