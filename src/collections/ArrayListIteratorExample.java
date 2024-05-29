package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Add some elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Create an Iterator to traverse the ArrayList
        Iterator<String> iterator = list.iterator();

        // Iterate over the elements using the Iterator
        System.out.println("Elements of the ArrayList:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Remove an element using the Iterator
        iterator = list.iterator(); // Reset the iterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("Banana")) {
                iterator.remove(); // Removes the current element
            }
        }

        // Display the ArrayList after removal
        System.out.println("ArrayList after removing 'Banana': " + list);
    
	}

}
