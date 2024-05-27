package exceptionHandling;

public class TrySingleCatchException {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		// NullPointerException
		try {
				String str = null;
		        int length = str.length();
		        
		} catch(NullPointerException e1) {
			System.out.println("Error message is:  "+e1);
			System.out.println("My name is srikant");
			System.out.println("we are learning Java");
			String str = "abc";
	        int length1 = str.length();
	        System.out.println("length is: "+length1);
		}
		
		System.out.println("Rest of the code");
		
		try {
			// ArithmeticException
			int result = 10 / 0; // Division by zero
	        
		} catch(ArithmeticException e) {
		System.out.println("Error message is "+e);
		}
		
		try {
			// NumberFormatException
	        String strs = "abc";
	        int num = Integer.parseInt(strs);
	        
		} catch(NumberFormatException e) {
		System.out.println("Error message is "+e);
		}
		
		try {
		// ArrayIndexOutOfBoundsException
        int[] arr = {1, 2, 3};
        int value = arr[3]; 
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error message is "+e);
		}
		
		
	}

}
