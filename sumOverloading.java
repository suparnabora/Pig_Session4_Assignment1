Question: Write a program consisting method sum() and demonstrate the concept of method
overloading using this method.




package com.acadgild.pig;

public class sumOverloading {

	public static void main(String[] args) {
		
		sumOverloading obj = new sumOverloading();
		
		int add1 = obj.sum(5, 6);
		float add2 = obj.sum((float)3.5, (float)7.4);
		System.out.println("Sum of Integers = "+add1);
		System.out.println("Sum of Float = "+add2);	
	}
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public float sum(float a, float b)
	{
		return a+b;
	}

}
