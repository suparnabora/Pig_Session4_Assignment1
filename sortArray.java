Question: Write a program in java using Arrays, that sorts the element in descending order.



package com.acadgild.pig;

public class sortArray {

	public static void main(String[] args) {
		int arr[] =	{6,2,9,10,45,76,14,54,33,60};
		int len = arr.length;
		
		for(int j = 0; j < len-1; j++)
		{
			for(int i= 0; i < len - 1; i++)		
			{
				if (arr[i] < arr[i+1]) 
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		System.out.println("Descending order array is: ");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+",");
		}
	}

}
