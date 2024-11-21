package learningJava;

public class ArrayLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// integer array
		int[] intArray = {11, 12, 13, 14, 15, 16, 17};
		
		int size = intArray.length;   //size = 7
		System.out.println("size of the array list is:  "+size);
		
		intArray[2] = intArray[2] * 10; // 13*10 = 130        /// 11, 12, 130, 14, 15, 16, 17
		System.out.println("Updating 3rd element "+ intArray[2]);
		
		for (int j = 0; j < size; j++) { //0  1
			intArray[j] = intArray[j] + 100 ;  // intArray[0] = 11 + 100 = 111  // intArray[1] = 12 + 100 = 112
		}
		
		for (int i = 0; i < size; i++) { //0 1 2 3 4 5 6 7 < 7 F
		System.out.println("Value of array at index: "+ i +" is: "+intArray[i]);
		}
//		
//		//float Array
//		float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f};
//		
//		// String Array
//		String[] stringArray = {"Apple","Banana","Orange"};
//		
//		//Char Array
//		char[] CharArray = {'a', 'b', 'c', 'd','e'};
//		
//		//int array
//		int[] inttArray = {11, 12, 13, 14, 15, 16, 17, 18}; 
				
		
	}

}
