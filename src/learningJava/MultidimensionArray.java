package learningJava;

public class MultidimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] multiIntAarray = {{1,2},
								   {3,4}}; //2X2
		
		// to show number of rows in the array multiIntAarray.length
		// to show the number of columns in the array multiIntAarray[i].length
		for (int i = 0; i< multiIntAarray.length; i++) {
			for (int j = 0 ; j < multiIntAarray[i].length; j++) {
				System.out.println("Row value : "+ i +" Column value: "+ j + " Element at this index :" + multiIntAarray[i][j]);
			}
		}
		
		for (int i = 0; i< multiIntAarray.length; i++) {
			for (int j = 0 ; j < multiIntAarray[i].length; j++) {
				
				multiIntAarray[i][j]= multiIntAarray[i][j] + 10;
				System.out.println("Row value : "+ i +" Column value: "+ j + " Element at this index :" + multiIntAarray[i][j]);
			}
		}
		
	}

}
