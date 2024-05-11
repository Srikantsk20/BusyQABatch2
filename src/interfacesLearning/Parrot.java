package interfacesLearning;

public class Parrot extends Bird implements Flying, Swimming {

	@Override
	public void fly(){
		System.out.println("Parrot can fly");
	}
	
	@Override
	public void swim(){
		System.out.println("Parrot can swim");
	}
	
	
}
