package learningJava;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 1;
		while (i <= 10) { // 1 <=10 T, 2<=10 T, 3<=10 T 4<=10 T
			if (i == 3) { // 1==3 F 2==3 F 3==3 T 4==3 F
				System.out.println("I will skip below code when I get executed for i = 3"); //printed 
				i++ ; // i = 4
				continue;	
			}
			System.out.println("value of i "+ i); // 1 2 // ignored 3
			i++; // 2, 3 // ignored 4
		}
		
	}

}

// Write a program to display number 11 to 20 by using for all the loops - while - do while and for loop, start the counter at 11.