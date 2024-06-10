package collections;
import java.util.ArrayList;
import java.util.Collections;

public class ListPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Srikant");  //indexing starts at 0
		a1.add("Kumar");  // index is 1 
		a1.add("BusyQA learning"); //index is 2 
		
		int size = a1.size();
		System.out.println("Number of elements in my array list:"+size);
		
		System.out.println("Array list a1 has following values"+a1);
		
		System.out.println("Index value at 1 is "+ a1.get(1));
		
		System.out.println("CHecking if Kumar is present in the list: "+ a1.contains("Kumar"));
		
		a1.remove(1);
		
		System.out.println("Array list a1 has following values"+a1);
		
		System.out.println("Index value at 1 is "+ a1.get(1));
		
		a1.add(1, "Zebra");  //insert in between the DB
		
		System.out.println("Array list a1 has following values"+a1);
		
		Collections.sort(a1);
		Collections.reverse(a1);
		
		System.out.println("Array list a1 has following values"+a1);
	}

}
