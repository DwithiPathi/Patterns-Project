package Question_21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Student implements java.io.Serializable{
	public String name;
	   public String address;
	   public transient int SSN;
	   public int number;
	   public void mailCheck() {
	      System.out.println("Mailing a check to " + name + " " + address);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student e = new Student();
	      e.name = "Reyan Ali";
	      e.address = "Phokka Kuan, Ambehta Peer";
	      e.SSN = 11122333;
	      e.number = 101;
	      
	      try {
	         FileOutputStream fileOut =new FileOutputStream("Sample2.txt");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in Sample2.txt");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	   }
	}


