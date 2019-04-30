package simpleprgm;


import java.util.Scanner;
public class Overloading {
	String[] Username = {"Rishith","krish","Laya"};
	String[] Password = {"Rishith","Krish","Laya"};
	
	Scanner in = new Scanner(System.in);
	
	String User;
	String Pswd;
	int flag=0;
	
	public void getUser()
	{
		System.out.println(" enter user name");
		User = in.next();
		System.out.println("enter password");
		Pswd = in.next();
	for(int i=0;i<=2;i++)
	{
		if(User.equalsIgnoreCase(Username[i]) && Pswd.equalsIgnoreCase(Password[i]))
		{
			//System.out.println("Pass");
			flag=1;
			break;
		}
		//else
		//{
			//System.out.println("Fail");
			
	//	}
	}
if(flag==1)
{
	System.out.println("Pass");
}
else
{
	System.out.println("fail");
}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading a = new Overloading();
		a.getUser();
		

	}

}
