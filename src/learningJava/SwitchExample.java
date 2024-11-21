package learningJava;
import java.util.*;
public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to ask user for the input
		System.out.println("Enter a day of the week (1-7):");
		//User will type  a number and hit enter button
		Scanner scanner = new Scanner(System.in);
		int dayNumber = scanner.nextInt();
		System.out.println("Number entered is: "+ dayNumber);
		scanner.close();
		
		String dayName;
		
//		problem statement: Ask user to enter the day of the week and display the day of the week 1 - sunday 2 - monday 3- Tuesday 4 - wednesday 5 - Thurs
		switch (dayNumber){
		case 1:
			dayName = "Sunday";
			break;
		case 2 :
			dayName = "Monday";
			break;
		case 3 :
			dayName = "Tuesday";
			break;
		case 4 :
			dayName = "Wednesday";
			break;
		case 5 :
			dayName = "Thursday";
			System.out.println("Writing to show ");
			System.out.println("Writing to show ");
			break;
		case 6 :
			dayName = "Friday";
			break;
		case 7 :
			dayName = "Saturday";
			break;
		default:
			dayName= "Invalid day number";
		}
		
		System.out.println("The day is: "+ dayName);
		
//		String day = "Tuesday";
//		int daynum = 0;
//		switch (day){
//		case "Monday":
//			daynum  = 1;
//			break;
//		case "Tuesday" :
//			daynum  = 2;
//			break;
//		case "Wednesday" :
//			daynum  = 3;
//			break;
//		default:
//			System.out.println("Invalid Day");
//		}
//		
//		System.out.println("The day is: "+ daynum);
		
		
		
	}

}
