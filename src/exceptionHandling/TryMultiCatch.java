package exceptionHandling;

public class TryMultiCatch {
	public static void main(String[] args) {
	try {
		//NullPointerException
//		String str = null;
//        int length = str.length();
        
        // ArithmeticException
//     	int result = 10 / 0; // Division by zero
     	
     	// NumberFormatException
//	    String strs = "abc";
//	    int num = Integer.parseInt(strs);
	    
	 // ArrayIndexOutOfBoundsException
	 		int[] arr = {1, 2, 3};
	 		int value = arr[3];
     	
		} catch(NullPointerException e1) {
			System.out.println("Error message is "+e1);
		} catch(ArithmeticException e2) {
		System.out.println("Error message is "+e2);
		} catch(NumberFormatException e3) {
		System.out.println("Error message is "+e3);
		} catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("Error message is "+e4);
		} catch(Exception e5) {
			System.out.println("Error message is "+e5);
		}
	System.out.println("Rest of the code");
 	}
}
