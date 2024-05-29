package wrapperClassesConcept;

public class WrapperClassExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Primitive data types
        int primitiveInt = 10;
        double primitiveDouble = 3.14;
        char primitiveChar = 'A';
        boolean primitiveBoolean = true;

        // Wrapper classes - We use wrapper classes (Integer, Double, Character, Boolean) to wrap these primitive values.
        Integer wrappedInt = Integer.valueOf(primitiveInt);
        Double wrappedDouble = Double.valueOf(primitiveDouble);
        Character wrappedChar = Character.valueOf(primitiveChar);
        Boolean wrappedBoolean = Boolean.valueOf(primitiveBoolean);

        // Accessing values and performing operations
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Wrapped Character: " + wrappedChar);
        System.out.println("Wrapped Boolean: " + wrappedBoolean);

        // Converting from String to primitive type - using wrapper classes' utility methods (e.g., parseInt()).
        String numberString = "123";
        int parsedInt = Integer.parseInt(numberString);
        System.out.println("Parsed Integer: " + parsedInt);
        
        //converting from primitive type to string
        int intval = 20;
        String strVal = Integer.toString(intval);
        System.out.println("Parsed String: " + strVal);
        
        String strval2 = String.valueOf(intval);
        System.out.println("Parsed using String.valueof: " + strval2);
        
        // Autoboxing (automatic conversion from primitive type to wrapper class) 
        // unboxing (automatic conversion from wrapper class to primitive type) features
        Integer autoboxedInt = 100; // Autoboxing: primitive int to Integer object
        int unboxedInt = autoboxedInt; // Unboxing: Integer object to primitive int
        System.out.println("Autoboxed Integer: " + autoboxedInt);
        System.out.println("Unboxed Integer: " + unboxedInt);
	}

}
