package simpleprgm;

import java.util.Scanner; //scanner 

public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String b;
		Float c;
		Scanner in = new Scanner(System.in);
		
	System.out.println("Enter an integer");
	a = in.nextInt();
	System.out.println("Input integer is " +a);
	
	System.out.println("Enter a String");
	b = in.next();
	System.out.println("Input string is " +b);
	
	System.out.println("Enter a Float number");
	c = in.nextFloat();
	System.out.println("Input float number is " +c);
	
	in.close();	
	}

}
