package Question_14;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList();
	      System.out.println("Initial size of al: " + al.size());

	      // add elements to the array list
	      al.add("C");
	      al.add("A");
	      al.add("d");
	      al.add(1, "b");
	      System.out.println("Size: " + al.size());

	      // display the array list
	      System.out.println("Content: " + al);

	      // Remove elements from the array list
	      al.remove("A");
	      al.remove(2);
	      System.out.println("Size: " + al.size());
	      System.out.println("Content: " + al);

	      try{
	         Iterator<String> iterator = al.iterator();
	         while(iterator.hasNext()) {
	            iterator.remove();
	         }
	      }catch(UnsupportedOperationException e) {
	         System.out.println("Exception");
	      }
	      System.out.println("Size: " + al.size());
	}

}
