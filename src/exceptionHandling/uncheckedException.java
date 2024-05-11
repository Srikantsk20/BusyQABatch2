package exceptionHandling;

public class uncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArithmeticException
		//int result = 10 / 0; // Division by zero
		
		// NullPointerException
		String str = null;
        //int length = str.length();
        
        // NumberFormatException
        String strs = "abc";
        //int num = Integer.parseInt(strs);
        
        // ArrayIndexOutOfBoundsException
        int[] arr = {1, 2, 3};
        //int value = arr[3]; 
	}

}
