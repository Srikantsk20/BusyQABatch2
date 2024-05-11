package exceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class checkedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//InterruptedException
		//Thread myThread = new Thread(() -> {
            //try {
            //    Thread.sleep(1000); // Sleep for 1 second
            //} catch (InterruptedException e) {
            //    System.out.println("InterruptedException caught: " + e.getMessage());
            //}
        //});
		
		
		//IOException
		//try {
            //FileWriter writer = new FileWriter("output.txt");
           // writer.write("Hello, World!");
            //writer.close();
        //} catch (IOException e) {
        //    System.out.println("IOException caught: " + e.getMessage());
        //}
		
		//FileNotFoundException
		//try {
         //   File file = new File("nonexistentfile.txt");
         //   Scanner scanner = new Scanner(file);
       // } catch (FileNotFoundException e) {
       //     System.out.println("FileNotFoundException caught: " + e.getMessage());
       // }
		
	}

}
