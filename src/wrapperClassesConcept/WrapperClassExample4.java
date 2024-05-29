package wrapperClassesConcept;

import java.util.ArrayList;
import java.util.List;

class WrapperExample<T> {
	    private T value;

	    public WrapperExample(T value) {
	        this.value = value;
	    }

	    public T getValue() {
	        return value;
	    }

	    public void setValue(T value) {
	        this.value = value;
	    }
	}

public class WrapperClassExample4 {
	 public static void main(String[] args) {
	       // Using wrapper class in generics
	       WrapperExample<Integer> intWrapper = new WrapperExample<>(10);
	       System.out.println("Integer Value: " + intWrapper.getValue());

	       WrapperExample<String> stringWrapper = new WrapperExample<>("Hello");
	       System.out.println("String Value: " + stringWrapper.getValue());

	       // Using wrapper class in collections
	       List<Integer> integerList = new ArrayList<>();
	       integerList.add(1);
	       integerList.add(2);
	       integerList.add(3);

	       System.out.println("Integer List: " + integerList);

	       List<String> stringList = new ArrayList<>();
	       stringList.add("Apple");
	       stringList.add("Banana");
	       stringList.add("Orange");

	       System.out.println("String List: " + stringList);
	   }
}



