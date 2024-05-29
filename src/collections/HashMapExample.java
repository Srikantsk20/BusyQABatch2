package collections;
import java.util.HashMap;
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        HashMap<String, Integer> map = new HashMap<>();

		        // Adding elements to the HashMap
		        map.put("John", 25);
		        map.put("Alice", 30);
		        map.put("Bob", 28);
		        
		        //HashMap allows one null key and multiple null values. Adding a null key will replace the previous mapping (if any) with null key, 
		        //while adding a null value is allowed and does not affect other mappings. 
		        //However, it's important to handle null keys and null values appropriately based on the requirements of your application.
		        
		        map.put(null, 10); // Adding a null key
		        map.put("Sri", null); // Adding a null value

		        // Displaying the elements of the HashMap
		        System.out.println("HashMap elements: " + map);

		        // Accessing elements by key
		        System.out.println("Age of John: " + map.get("John"));
		        System.out.println("Age of Alice: " + map.get("Alice"));

		        // Checking if a key exists
		        String name = "Bob";
		        if (map.containsKey(name)) {
		            System.out.println(name + " exists in the map.");
		        } else {
		            System.out.println(name + " does not exist in the map.");
		        }

		        // Removing an element
		        map.remove("Alice");
		        System.out.println("HashMap after removing Alice: " + map);

		        // Checking the size of the HashMap
		        System.out.println("Size of the HashMap: " + map.size());

		        // Clearing the HashMap
		        map.clear();
		        System.out.println("HashMap after clearing: " + map);
	}

}
