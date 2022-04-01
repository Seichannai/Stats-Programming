package Prgrams; 

import java.util.Scanner;

//person class declaration

public class Person {
	//main method
	public void prop() {
	    try(Scanner inp = new Scanner(System. in )){
	    System.out.println("How many people in the class?");
	    //prompt user to input number of people in the class
	    //birthday 
	    int birthday= inp.nextInt();
	    System.out.println("How many times?");
	    //prompt user enter number of times
	    int times = inp.nextInt();
	    int x[] = new int[birthday];
	    int matches = 0;
	    boolean out = false;
	   
	    for (int i = 0; i < times; i++) {
	        for (int j = 0; j < birthday; j++) {
	            x[j] = (int)(Math.random() * 365);//checking matching birthdays without taking care of leap year
	        }
	        for (int j = 0; j < birthday; j++) {
	            for (int k = j + 1; k < birthday; k++) {
	                if (x[j] == x[k]) {
	                    matches++;
	                    out = true;
	                    break;
	                }
	            }
	            if (out) {
	                out = false;
	                break;
	            }
	        }
	    }
	    double probab = (double) matches / times;
	    System.out.println("The probability for two people sharing the same birthday is: " + probab + ".");
	}
}
}
