package basic;

import java.util.Scanner;

public class Conditiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		for(a=1;a<=5;a++)
		{
			System.out.println("interger value " + a);
		}
		
		//if loop

		int marks;
		int passmarks = 35;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the marks");
		marks=in.nextInt();

		if(marks >= passmarks)
		{
			System.out.println("you are passed");
		}
		else {
			
		
			System.out.println("you failed!");
		}
		
		//while loop
		
		int c =2;
	
		while(c<=10)
		{
			System.out.println("Output" +c);
	c++;
			
		}



		in.close();
		
		 int arr[]={2,11,45,9};
        //i starts with 0 as array index starts with 0 too
        int i=0;
        while(i<0){
             System.out.println(arr[i]);
             i++;
        }

		
		
		
		
	
	
	}

	
	}


