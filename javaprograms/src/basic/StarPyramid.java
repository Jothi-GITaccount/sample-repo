package basic;

public class StarPyramid {
	
	
	public static void printstars(int n)
	{  
	  for(int i=0;i<=n;i++)
	  {  
		 for(int j=0;j<=i;j++)
		 {
			System.out.print("* ");
		 }
	  System.out.println(" ");
	  }
	  for(int k=0;k<=n;k++)
	  {  
		 for(int l=n;l>=k;l--)
		 {
			System.out.print("* ");
		 }
	  System.out.println(" ");
	  }
	}
	

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int n= 5;
printstars(n);
	}
}
