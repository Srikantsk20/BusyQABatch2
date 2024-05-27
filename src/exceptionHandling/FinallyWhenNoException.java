package exceptionHandling;

public class FinallyWhenNoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	        
	        // ArithmeticException
	     	int result = 10 /1; // Division by zero
	     	System.out.println("Division value is:  "+result);
			} catch(ArithmeticException e1) {
				System.out.println("Error message is "+e1);
			} finally {
				System.out.println("Finally block is always executed");
			}

	}
}
