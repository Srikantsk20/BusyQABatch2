package collections;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add(null);
        hashSet.add(null);
        // Adding a duplicate element (which will not be added)
        hashSet.add("Apple");

        // Displaying the elements of the HashSet
        System.out.println("HashSet elements: " + hashSet);

        // Removing an element
        hashSet.remove("Banana");

        // Displaying the elements after removal
        System.out.println("HashSet elements after removal: " + hashSet);

        // Checking if an element exists
        System.out.println("Does 'Apple' exist? " + hashSet.contains("Apple"));

        // Checking the size of the HashSet
        System.out.println("Size of the HashSet: " + hashSet.size());

        // Clearing the HashSet
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);
	}

}
