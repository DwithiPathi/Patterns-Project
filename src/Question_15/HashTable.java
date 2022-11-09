package Question_15;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hashtable<Integer, String> ht1 = new Hashtable<>();
	        Hashtable<Integer, String> ht2
	            = new Hashtable<Integer, String>();
	  
	        // Inserting the Elements
	        // using put() method
	        ht1.put(1, "one");
	        ht1.put(2, "two");
	        ht1.put(3, "three");
	  
	        ht2.put(4, "four");
	        ht2.put(5, "five");
	        ht2.put(6, "six");
	  
	        // Print mappings to the console
	        System.out.println("Mappings of ht1 : " + ht1);
	        System.out.println("Mappings of ht2 : " + ht2);
	    }
	}
