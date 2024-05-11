package inheritance;

public class MethodOverridingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalMethodOverriding animal1 = new Dog1(); // Create Dog object using Animal reference
    	AnimalMethodOverriding animal2 = new Cat1(); // Create Cat object using Animal reference

        animal1.sound(); // Outputs: Dog barks
        animal2.sound(); // Outputs: Cat meows
	}

}
