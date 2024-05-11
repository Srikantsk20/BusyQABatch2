package advanceJavaConcepts;

public class StaticKeywordP1Main {

	public static void main(String[] args) {
		
		 // Accessing static variable directly using the class name
        System.out.println("Initial count: " + StaticKeywordP1.count);

        // Calling static method to increment count
        StaticKeywordP1.increment();
        System.out.println("Count after increment: " + StaticKeywordP1.count);

        // Calling static method to reset count
        StaticKeywordP1.reset();
        System.out.println("Count after reset: " + StaticKeywordP1.count);
    }
	
}

/*
However, static methods indirectly affect memory management in the sense that they can be used to operate on data that is shared 
across all instances of a class, potentially leading to more efficient memory usage. For example, if a method doesn't need to access
 instance variables and operates only on static data or other static methods, making it static can reduce the memory footprint because
  it doesn't need to be duplicated for each instance of the class.

Additionally, static methods are often used for utility functions or operations that don't require access to instance-specific data. 
By keeping such methods static, you avoid creating unnecessary object instances, which can help conserve memory if those instances are 
not needed.

So while static methods themselves don't directly manage memory, they can contribute to more efficient memory usage in certain 
scenarios by minimizing the creation of unnecessary objects and reducing duplication of code.
*/