package learningJava;

public class WhileLoop {
	public static void main(String[] args) {
		// Print a series -> starting from 1 till 10
		// display 1 2 3 4 5 6 7 8 9 10
		int i = 1;
		
		System.out.println("While Loop");
		
//		while(i<=10) { //1<=10 T, 2<=10 T, 3<=10 T, 4 
//			System.out.println("Value of i: "+ i);
//			i++; //2 , 3
//			
////			if(i==5) {
////				System.out.println("I am in If statement");
////				break;
////			}
////			
////			if(i==6) {
////				System.out.println("continue part 1");
////				continue;
////			}
////			System.out.println("continue part 2");
//		}
	
		System.out.println("Do While Loop");
		i = 1;
		// in do - while loop all the statments in the do block is executed atleast 1 time
		do {
			System.out.println("Value of i: "+ i);
			i++; 
		} while (i <= 10); //12 <= 10 F
	}
}
// 1 < = 10 condition is true -> value of i = 1 
// 2 < = 10 condition is true -> value of i = 2
//..
// 10 < = 10 condition is true -> value of i = 10
// i = 11 expression 11 <= 10 condition is false = 