package advanceJavaConcepts;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingP1 example = new MethodOverloadingP1();

        System.out.println("Adding two integers: " + example.add(5, 3));
        System.out.println("Adding three integers: " + example.add(5, 3, 2));
        System.out.println("Adding two doubles: " + example.add(5.5, 3.2));
        System.out.println("Adding three doubles: " + example.add(5.5, 3.2, 1.7));
        System.out.println("Adding an integer and a double: " + example.add(5, 3.5));
        System.out.println("Adding a double and an integer: " + example.add(3.5, 5));
    
	}

}
