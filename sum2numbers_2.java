
Question: Rewrite the above code, where, inputs are provided by the user at runtime and the output is
printed.


package com.acadgild.pig;

import java.util.Scanner;

public class acad_withinput {
	
	public static void main(String[] args) {
		
		int firstNum, secondNum, sum;
		
		Scanner scn = new Scanner(System.in);
	    System.out.print("Enter first number: ");
	    firstNum = scn.nextInt();
	    System.out.print("Enter second number: ");
	    secondNum = scn.nextInt();
	    sum = firstNum + secondNum;
	    System.out.println("The sum is: " + sum);
	    scn.close();
	}
}