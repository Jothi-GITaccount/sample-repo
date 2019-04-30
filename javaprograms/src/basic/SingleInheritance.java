package basic;

  // Multilevel Inheritance

class companyname {
	
	void company() {
		System.out.println("Company Name is VMWare");
	}
}

 class status extends companyname {

	String Designation = "CEO";
	void location() {
		
		System.out.println("working location : Chennai");
	}
	
}


public class SingleInheritance extends status {
	
	String EmployeeName = "Krish";
    int EmployeeID = 7;
    
    void workstatus () {
    	System.out.println("working status : Employed");
    	
    }

       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance obj = new SingleInheritance();
		System.out.println("Employee ID : " +obj.EmployeeID);
		System.out.println("EmployeeName : " +obj.EmployeeName);
		System.out.println("Designation :  " +obj.Designation);
		obj.workstatus();
		obj.location();
		obj.company();
		
	}

}
