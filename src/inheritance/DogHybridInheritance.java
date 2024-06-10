package inheritance;

public class DogHybridInheritance implements AnimalHybridInheritance {
	// Implement the eat() method from the Animal interface
    //@Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

//    // Implement the sleep() method from the Animal interface
//    //@Override
//    public void sleep() {
//        System.out.println("Dog is sleeping...");
//    }
	
}


//Define a class Cat that implements the Animal interface
class CatHybridInheritance implements AnimalHybridInheritance {
	 // Implement the eat() method from the Animal interface
	 @Override
	 public void eat() {
	     System.out.println("Cat is eating...");
	 }
	
	 // Implement the sleep() method from the Animal interface
//	 @Override
//	 public void sleep() {
//	     System.out.println("Cat is sleeping...");
//	 }
}