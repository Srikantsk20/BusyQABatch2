package accessModifier;

public class PrivateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();

        // Accessing public method to display privateVariable
        obj.displayPrivateVariable(); // Outputs: Private Variable: 10

        // Trying to access private variable directly
        // This will cause a compilation error as privateVariable is not accessible outside MyClass
         //System.out.println(obj.privateVariable);

        // Accessing public method that calls privateMethod
        obj.publicMethodCallingPrivateMethod();
        //obj.privateMethod();
        // Outputs: Calling privateMethod from publicMethod:
        //          This is a private method.

	}

}
