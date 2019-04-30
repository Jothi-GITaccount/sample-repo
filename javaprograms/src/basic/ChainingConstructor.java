package basic;
public class ChainingConstructor {
	
	int rollno;
	String Studentsname;
	double marks;
	
	 ChainingConstructor()
	{
		this.Studentsname = "krish";
		
	}
	
	  ChainingConstructor(String name)
	{
	   this(name,7);   
	}
	 ChainingConstructor(String name ,int roll)
	{
		this(name,roll,99);
	}
	
	 ChainingConstructor(String name, int roll, double score)
	{
	  this.Studentsname = name;
	  this.rollno = roll;
	  this.marks = score;
	  System.out.println("Student Name is " +Studentsname);
	   System.out.println("RollNo is " +rollno);
	   System.out.println("Score is " +marks);
	   
	 
	  
	}
   	public static void main(String[] args) {
		// TODO Auto-generated method stub
   		new ChainingConstructor();
   		
   ChainingConstructor obj = new ChainingConstructor("Vijay",555, 5.5);
   // obj.display();
	}

}
