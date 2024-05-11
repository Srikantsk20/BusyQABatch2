package inheritance;

public class HybridInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create instances of Dog and Cat
		DogHybridInheritance dog = new DogHybridInheritance();
		CatHybridInheritance cat = new CatHybridInheritance();

        // Call methods defined in the Animal interface
        dog.eat();  // Outputs: Dog is eating...
        dog.sleep(); // Outputs: Dog is sleeping...

        cat.eat();  // Outputs: Cat is eating...
        cat.sleep(); // Outputs: Cat is sleeping...
	}

}
