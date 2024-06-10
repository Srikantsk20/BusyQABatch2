package inheritance;

public class HybridClassExtendTwoInterfaces implements CatHybridInterface, DogHybridInterface {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Printing eat Method");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Printing Dog's Bark Method");
	}

	@Override
	public void meow() {
		// TODO Auto-generated method stub
		System.out.println("Printing Cat's Meow Method");
	}

}
