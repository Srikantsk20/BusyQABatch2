package superAndFinal;

public class ParentS3 {
	 ParentS3() {
		 System.out.println("Parent class constructor");
	 }
}

class ChildS3 extends ParentS3 {
	ChildS3() {
	    super(); // Invoking parent class constructor using super()
	    System.out.println("Child class constructor");
	}
}
