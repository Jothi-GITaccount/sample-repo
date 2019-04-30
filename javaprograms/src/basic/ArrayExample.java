package basic;

import java.util.Scanner;

 class sample{
	int a,b;
	public void get() {
		a=5;
		b=5;
	}
	public int add() {
		return a+b;
	}
	public void add(int c, int d)
	{
		System.out.println("Overloading"+(c+d));
	}
}

public class ArrayExample {
	
	static String[] studentname = new String[5];
	static int[] roll = new int[5];
	static int[] marksaverage = new int[5];
	static int[] m1 = new int[5];
	static int[] m2 = new int[5];
	
	
	static double[] average = new double[5];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
				sample s = new sample();       
				s.add(6, 6);
				s.get();
				int r=s.add();
				System.out.println("Add="+r);
				
		/*
		 * for(int i=0;i<=4;i++) { System.out.println("Enter the student name :"+i);
		 * studentname[i] = in.next(); System.out.println("Enter the roll :"+i); roll[i]
		 * = in.nextInt(); System.out.println("Enter the marks 1 :"+i); m1[i] =
		 * in.nextInt(); System.out.println("Enter the marks 2 :"+i); m2[i] =
		 * in.nextInt();
		 * 
		 * marksaverage[i] = m1[i] + m2[i]; average[i] = marksaverage[i]/2;
		 * 
		 * 
		 * System.out.println("Average marks :"+i+average[i]);
		 * 
		 * }
		 */

	}
	
// user[5]=
	//pwd[5]=
	
}
