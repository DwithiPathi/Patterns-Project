package Question_20;

import java.sql.Date;

public class Student implements Runnable{
	 private String student;
	  private static final int REPETITIONS = 2;
	  private static final int DELAY = 100;
	  public Student(String aStudent) 
	{
	student = aStudent;
	 }
	 //predefined method 
	public void run() {
		  for(int i = 1; i <= REPETITIONS; i++) {
		 try {
		   Date now = new Date(i);
		   System.out.println(now + " " + student);
		   Thread.sleep(DELAY);
		 } catch (InterruptedException ex){
		   System.out.println("Interrupt");
		   //return;
		 }
		  }
		   }
	public static void main(String[] args) {
		Student r1 = new Student("Hello, Harika");
		Student r2 = new Student("Goodbye, Kiran");
		Student r3 = new Student("Hi, Dwithi");
		Student r4 = new Student("Hey, Gopija");
		 Thread t1 = new Thread(r1);
		 Thread t2 = new Thread(r2);
		 Thread t3 = new Thread(r3);
		 Thread t4 = new Thread(r4);
		 t1.start();
		 t2.start();
		 t3.start();
		 t4.start();

	}

}
