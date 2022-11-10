package Question_15;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Create an empty hash map by declaring object
        // of string and integer type
        HashMap<String, Integer> map = new HashMap<>();
 
        // Adding elements to the Map
        // using standard put() method
        map.put("a", 10);
        map.put("b", 30);
        map.put("c", 20);
        // Print size and content of the Map
        System.out.println("Size of map: "+ map.size());
        // Printing elements in object of Map
        System.out.println(map);
        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (map.containsKey("a")) {
            // Mapping
            Integer a = map.get("a");
            // Printing value for the corresponding key
            System.out.println("value for key"+ " \"a\" is:- " + a);
        }
	}

}
