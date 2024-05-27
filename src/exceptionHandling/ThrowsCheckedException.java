package exceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThrowsCheckedException {

//	public static void main(String[] args) throws InterruptedException
//		{
//		// TODO Auto-generated method stub
//		System.out.println("Test Started");
//		 Thread.sleep(1000);
//		 System.out.println("Test is complete");
//	}
	
//	public static void main(String[] args) throws IOException
//		{
//		// TODO Auto-generated method stub
//		FileWriter fr = new FileWriter("output.txt"); //File not personal
//	}
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException
		{
		// TODO Auto-generated method stub
		File file = new File("nonexistentfile.txt");
        Scanner scanner = new Scanner(file); //File not personal
	}

}
