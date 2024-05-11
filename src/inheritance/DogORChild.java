package inheritance;

public class DogORChild extends AnimalORParent {
	@Override
	void sound() {
		System.out.println("Dog Barks");
	}
}

class CatORChild extends AnimalORParent {
	@Override
	void sound() {
		System.out.println("Cat Meows");
	}
}

