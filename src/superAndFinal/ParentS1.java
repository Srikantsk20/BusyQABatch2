package superAndFinal;

public class ParentS1 {
	int num = 100;
}

class ChildS1 extends ParentS1 {
	   int num = 200;
	   
	   void display() {
	        System.out.println("Child class num: " + num); // Accessing child class variable
	        System.out.println("Parent class num: " + super.num); // Accessing parent class variable using super
	 }
}
