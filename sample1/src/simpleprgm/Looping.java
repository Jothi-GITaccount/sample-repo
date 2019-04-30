package simpleprgm;

import java.util.Scanner;


public class Looping {
	
	public static void call()
	{
		System.out.println("Looping completed");
	}
	public static void add()
	{
		int a;
		int b;
		Scanner in = new Scanner(System.in);
		System.out.println("enter a value");
		a = in.nextInt();
		System.out.println("a value is" +a);
		
		System.out.println("enter b value");
		b = in.nextInt();
		System.out.println("b value is" +a);
		int Sum = a +b ;
		System.out.println("Sum of two numbers is" +Sum);
		in.close();	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For loop
	
		int marks;
		for( int i=0;i<=10;i++)
		System.out.println(i);
		call();
		add();
		Scanner in = new Scanner(System.in);
		
		//If loop
		System.out.println("enter students marks");
		marks = in.nextInt();
		System.out.println("student mark is" + marks);
		if(marks >=45)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	in.close();		
	}

}
