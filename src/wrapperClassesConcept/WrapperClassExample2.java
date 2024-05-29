package wrapperClassesConcept;

public class WrapperClassExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using Integer wrapper class
        Integer num1 = Integer.valueOf(10); // Creating Integer object from int
        Integer num2 = Integer.valueOf("20"); // Creating Integer object from String

        // Converting Integer to int
        int intValue1 = num1.intValue();
        int intValue2 = num2; // Auto-unboxing: Integer to int

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("intValue1: " + intValue1);
        System.out.println("intValue2: " + intValue2);

        // Using Double wrapper class
        Double doubleVal = Double.valueOf(3.14); // Creating Double object from double
        double doublePrimitive = doubleVal.doubleValue(); // Converting Double to double

        System.out.println("doubleValue: " + doubleVal);
        System.out.println("doublePrimitive: " + doublePrimitive);

        // Using Boolean wrapper class
        Boolean bool1 = Boolean.valueOf(true); // Creating Boolean object from boolean
        Boolean bool2 = Boolean.valueOf("false"); // Creating Boolean object from String

        boolean boolPrimitive1 = bool1.booleanValue(); // Converting Boolean to boolean
        boolean boolPrimitive2 = bool2; // Auto-unboxing: Boolean to boolean

        System.out.println("bool1: " + bool1);
        System.out.println("bool2: " + bool2);
        System.out.println("boolPrimitive1: " + boolPrimitive1);
        System.out.println("boolPrimitive2: " + boolPrimitive2);

        // Using Character wrapper class
        Character ch = Character.valueOf('A'); // Creating Character object from char
        char chPrimitive = ch.charValue(); // Converting Character to char

        System.out.println("ch: " + ch);
        System.out.println("chPrimitive: " + chPrimitive);
	}

}
