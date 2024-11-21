package learningJava;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problem statement - write a loop to print 1 to 10 but when 5 is encountered then break the loop
		
		int i = 1 ;
		while (i<=10) { //1<=10 T, 2<=10 T... 5<=10T
			
			if(i==5) { //1==5 F, 5==5 T
				System.out.println("Break condition reached value of I is now: "+i);
				break;
			}
		
			System.out.println("Value of I is: "+i);
			i= i+1; //2 3  i++ == i= i+1 
		}
		
		System.out.print("Out of While Loop");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//int i = 1;
//		while (i <= 10) {
//			System.out.println("value of i "+ i);
//			
//			if (i == 5) {
//				System.out.println("VAlue of i is 5 and breaking the loop");
//				break;
//			}
//			
//			i++;
//		}
	}

}
