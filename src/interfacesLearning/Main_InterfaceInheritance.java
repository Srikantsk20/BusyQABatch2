package interfacesLearning;

public class Main_InterfaceInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrot P1 = new Parrot();
		P1.display();  //accessing Bird class
		P1.fly(); //accessing interface Flying
		P1.swim(); //accessing interface Swimming
	}

}
