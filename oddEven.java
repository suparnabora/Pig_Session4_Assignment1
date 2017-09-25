
Question: Write a program to accepts two numbers from stdin and find all the odd as well as even
numbers present in between them.


import java.util.Scanner;

public class acad_oddeven_stdin {

	public static void main(String[] args) {			
			int from_num, to_num;
			String listeven = "";
			String listodd = "";
			
			Scanner scn = new Scanner(System.in);
			from_num = scn.nextInt();
		    to_num = scn.nextInt();
			scn.close();
			
		    for(int i=from_num; i <= to_num; i++)
		    {
		    	if(i%2 == 0)
		    		listeven = listeven + i + ",";
		    	else
		    		listodd = listodd + i + ",";
		    }
		    System.out.println("Even numbers are: " +listeven);
		    System.out.println("Odd numbers are: " +listodd);		    
	}
}