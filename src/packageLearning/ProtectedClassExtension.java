package packageLearning;

import accessModifier.ProtectedClass;

public class ProtectedClassExtension extends ProtectedClass {
	 	public ProtectedClassExtension(int value) {
	        super(value);
	    }

	    public void displayProtected() {
	        System.out.println("Protected Variable: " + protectedVariable);
	        protectedMethod(); // Accessing protected method
	    }
}
