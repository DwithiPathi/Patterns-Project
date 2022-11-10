package Question_15;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hashtable<Integer, String> hash1= new Hashtable<>();
	        Hashtable<Integer, String> hash2
	            = new Hashtable<Integer, String>();
	  
	        // Inserting the Elements
	        // using put() method
	        hash1.put(1, "one");
	        hash1.put(2, "two");
	        hash1.put(3, "three");
	  
	        hash2.put(4, "four");
	        hash2.put(5, "five");
	        hash2.put(6, "six");
	  
	        // Print mappings to the console
	        System.out.println("Mappings of hash1 : " + hash1);
	        System.out.println("Mappings of hash2 : " + hash2);
	    }
	}
