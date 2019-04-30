package basic;

import java.util.Scanner;

public class IncomeTax {
	


	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the income for the year 2018 :");
		double income = in.nextDouble();
		double tax = 0;
		
		
		
		if (income<=25000) 
		{
			tax= 0;
			System.out.println(" tax deduction is " +tax);
			System.out.println("Salary amount = " +income);
		}
		
			else if(income<=50000)
			{
			tax = income*0.10;
			System.out.println("tax deduction is " +tax);
			System.out.println("Salary amount = " +(income-tax));
			}
			else if (income>=100000)
			{
			tax = income*0.15;
			System.out.println("tax deduction is " +tax);
			System.out.println("Salary amount = " +(income-tax));
			}
			
		}
		
}


