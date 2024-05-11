package learningJava;
import java.util.Scanner;


public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
        // Simple if statement
        if (number > 10) {
            System.out.println("Number is greater than 10");
        }

        // If-else statement
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // Else-if ladder
        if (number < 0) {
            System.out.println("Number is negative");
        } else if (number == 0) {
            System.out.println("Number is zero");
        } else if (number < 10) {
            System.out.println("Number is single-digit");
        } else if (number < 100) {
            System.out.println("Number is double-digit");
        } else {
            System.out.println("Number is triple-digit or greater");
        }
	}
}
