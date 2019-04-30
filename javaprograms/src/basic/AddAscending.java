package basic;

import java.util.Scanner;

public class AddAscending {
	
	static int[] numbers = new int[5];
	static int temp;
	static int sum;
	static int i;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		// Getting numbers from user
		for (int i=0;i<=4;i++) 
			{
			System.out.print("Enter the number : ");
			numbers[i]=in.nextInt();
			
			}
		//sorting in ascending order
			for (int i=0;i<5;i++) {
				{
					for (int j=i+1;j<5;j++)
					{
						if(numbers[i]>numbers[j])
						{
							temp=numbers[i];
							numbers[i]=numbers[j];
							numbers[j]=temp;	
						}
					}
					
				}
			
			}
			 System.out.print("Ascending Order:");
	 //printing in ascending order
			 
		        for (int i = 0; i < 5 - 1; i++) 
		        {
		            System.out.print(numbers[i] + ",");
		        }
		        System.out.println(numbers[5- 1]);
	//adding array numbers	        
		        for( int num :numbers) {
		            sum = sum+num;
		            System.out.print("Sum of array elements is:"+sum);
		       
		        }
  in.close();
		        

	}

}
