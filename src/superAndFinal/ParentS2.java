package superAndFinal;

public class ParentS2 {
	void display() {
        System.out.println("Parent class method");
    }
}

class ChildS2 extends ParentS2 {
    void display() {
        super.display(); // Invoking parent class method using super
        System.out.println("Child class method");
    }
}