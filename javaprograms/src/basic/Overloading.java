package basic;

import java.util.Scanner;

public class Overloading {
	
String[]  Username = {"jash","Krish","Rishith"};
String[] Password = {"jash","Krish","Rishith"};

Scanner in = new Scanner(System.in);

String user;
String pswd;
int flg=0;

public void getuser()
{

System.out.println("username from user : ");
user= in.next();
System.out.println("password from user :");
pswd = in.next();

for(int i=0;i<=2;i++)
{
	if(user.equalsIgnoreCase(Username[i]) && pswd.equalsIgnoreCase(Password[i]))
		{
		 //System.out.println("pass");
		flg=1;
		 break;
		 
		}
	//else
	//{
		//System.out.println("Fail");
	//}
	
}
if (flg==1)
System.out.println("Pass");
else
System.out.println("fail");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Overloading s = new Overloading();
	s.getuser();
	
	}
}
