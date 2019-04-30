package basic;

public class ConstructorSampleCode {

	
	String name;
	
	//Constructor
	
	ConstructorSampleCode()
	{
		System.out.println("Constructor executed");
		this.name = "Hello";
		
	}
	
//	Constructor with parameters
	int z;
    ConstructorSampleCode(int x,int y)
    {
   int z =  x + y;
   System.out.println("Sum is " +z);
 
    }
   	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//  new ConstructorSampleCode(); Constructor called without data variables in it.
		
     ConstructorSampleCode obj = new ConstructorSampleCode();
     System.out.println(obj.name);
     ConstructorSampleCode obj1 = new ConstructorSampleCode(2,2);
    
    
    
	 
     
	}

}
