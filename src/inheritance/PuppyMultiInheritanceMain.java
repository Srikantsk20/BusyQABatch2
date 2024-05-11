package inheritance;

public class PuppyMultiInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PuppyMultiInheritance puppy = new PuppyMultiInheritance();
        puppy.eat(); // Accessing eat() method from the Animal class
        puppy.bark(); // Accessing bark() method from the Dog class
        puppy.weep(); // Accessing weep() method from the Puppy class
	}

}
