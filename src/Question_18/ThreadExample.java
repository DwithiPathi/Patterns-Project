package Question_18;



public class ThreadExample implements Runnable{

		// TODO Auto-generated method stub
		String msg;
		ThreadExample(String s){
			msg=s;
			System.out.println("Hi");
		}
		public void run() {
			System.out.println(msg);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ThreadExample obj1=new ThreadExample("hello");
			ThreadExample obj2=new ThreadExample("world");
			Thread t1 = new Thread(obj1);
			Thread t2 = new Thread(obj2);
			//starting the thread twice
			t1.start();
			t1.start();
	}

}
