
Question: Write a program with method name sum() that accepts two parameters from user and print
the sum of two numbers. Output format should be as:

First number is:
Second number is:
Sum is:


package com.acadgild.pig;

import java.util.Scanner;

public class acad_withfunction {

	public static void main(String[] args) {			
			int firstNum, secondNum;
			
			Scanner scn = new Scanner(System.in);
		    System.out.print("Enter first number: ");
		    firstNum = scn.nextInt();
		    System.out.print("Enter second number: ");
		    secondNum = scn.nextInt();		    
		    sum(firstNum, secondNum);	    
		    scn.close();
	}
	
	public static void sum(int num1, int num2)
	{
		int sum = num1 + num2;
		System.out.println("First number is: "+num1);
		System.out.println("Second number is: "+num2);
		System.out.println("Sum is: "+sum);		
	}
}