package inheritance;

public class AnimalMethodOverriding {
	// Method that can be overridden by subclasses
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog extends Animal
class Dog1 extends AnimalMethodOverriding {
    // Override the sound() method of the superclass
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat extends Animal
class Cat1 extends AnimalMethodOverriding {
    // Override the sound() method of the superclass
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}


