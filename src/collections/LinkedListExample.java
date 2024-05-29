package collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Add an element to the beginning of the LinkedList
        linkedList.addFirst("Grapes");

        // Add an element to the end of the LinkedList
        linkedList.addLast("Pineapple");

        // Display the elements of the LinkedList
        System.out.println("LinkedList elements: " + linkedList);

        // Retrieve and print the first and last elements
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // Remove the first and last elements
        linkedList.removeFirst();
        linkedList.removeLast();

        // Display the elements after removal
        System.out.println("LinkedList elements after removal: " + linkedList);

        // Check if an element exists in the LinkedList
        System.out.println("Does 'Banana' exist? " + linkedList.contains("Banana"));

        // Get the size of the LinkedList
        System.out.println("Size of the LinkedList: " + linkedList.size());
    
	}

}
