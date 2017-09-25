Question: Joe is scared to go to school. When her dad asked the reason, joe said she is unable to
complete the task given by her teacher. The task was to find the “first 10 multiples” of the
number entered from stdin




package com.acadgild.pig;

import java.util.Scanner;

public class first10Multiples {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = in.nextInt();
		for(int i = 1; i <=10; i++)
		{
			int res = num*i;
			System.out.println(num + "x" + i + "= " + res);
		}
		in.close();
	}

}
