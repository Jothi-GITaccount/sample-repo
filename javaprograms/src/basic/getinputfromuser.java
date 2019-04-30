package basic;

//getting input data from user using scanner 

import java.util.Scanner;

public class getinputfromuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String s;
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter the integer");
	i = in.nextInt();
	System.out.println("you entered the integer " + i);
	
	System.out.println("Enter the String");
	s = in.next();
	System.out.println("you entered the string " + s);
	in.close();
	
	

	}

}
