package collections;
import java.util.ArrayList;

public class ArrayListE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stringList = new ArrayList<>();
		
		// Adding elements to the ArrayList
        stringList.add("Apple");
        stringList.add("Apple");
        stringList.add("Orange");
        stringList.add("Grapes");
        stringList.add("Banana");
        
        System.out.println("Size of ArrayList: "+stringList.size());
       
        // Displaying the elements of the ArrayList
        System.out.println("Elements of the ArrayList:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
        
        // Accessing elements by index
        System.out.println("Element at index 2: " + stringList.get(2));

        // Removing an element
        stringList.remove("Banana");
        System.out.println("After removing 'Banana': " + stringList);
        
        System.out.println("___________________ ");
        stringList.remove(2);  //2 describes after number of element and not position -> 3rd element will be deleted
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
        // Checking if an element exists
        System.out.println("Does 'Apple' exist? " + stringList.contains("Apple"));

        // Size of the ArrayList
        System.out.println("Size of the ArrayList: " + stringList.size());

        // Clearing the ArrayList
        stringList.clear();
        System.out.println("After clearing the ArrayList: " + stringList);
	}

}
