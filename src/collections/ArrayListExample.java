package collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stringList = new ArrayList<>();
		
		stringList.add("Srikant");
		stringList.add("Kumar");
		stringList.add("QALearnings");
		
		int size = stringList.size();
		System.out.println("Size of array list: "+size);
		
		System.out.println(".get method example: "+ stringList.get(2));
		System.out.println("contains method test for Kumar in the list: "+ stringList.contains("Kumar"));
		
		stringList.remove(0);
		
		System.out.println("Array List is : "+stringList);
		
		stringList.add(1, "Srikant");
		System.out.println("Array List is : "+stringList);
	}

}
