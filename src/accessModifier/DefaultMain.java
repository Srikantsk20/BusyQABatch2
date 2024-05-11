package accessModifier;

public class DefaultMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMyClass obj = new DefaultMyClass();

        // Accessing defaultVariable and defaultMethod from the same package
        obj.defaultVariable = 10;
        obj.defaultMethod();
	}

}
