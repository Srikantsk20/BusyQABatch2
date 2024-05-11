package accessModifier;

public class MyClass {
	private int privateVariable; // Private member variable

    // Constructor
    public MyClass() {
        privateVariable = 10;
    }

    // Public method to access privateVariable
    public void displayPrivateVariable() {
        System.out.println("Private Variable: " + privateVariable);
    }

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Public method calling privateMethod
    public void publicMethodCallingPrivateMethod() {
        System.out.println("Calling privateMethod from publicMethod:");
        privateMethod();
    }
}
