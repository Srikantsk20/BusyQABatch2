package interfacesLearning;

public class MultiInterfaceClass implements Flying, Swimming {

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		 System.out.println("Duck can swim");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		 System.out.println("Duck can fly");
	}

}
