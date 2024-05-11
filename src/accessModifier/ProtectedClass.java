package accessModifier;

public class ProtectedClass {
	//Protected Variable
	protected int protectedVariable;
    protected String message;
    
    //Protected Constructor
    protected ProtectedClass (int value) {
        this.protectedVariable = value;
    }
    
    // Protected Method
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
}
