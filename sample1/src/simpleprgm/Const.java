package simpleprgm;

public class Const {
	
	String name;
	
	public Const()
	{
		this.name = "Rishith";
		
	}
	public Const(String name)
	{
		this.name = "krish";
		
	}
public void getname()
{
	System.out.println(this.name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Const Obj1 = new Const();
        Const Obj2 = new Const("Vrushalini");
Obj1.getname();
Obj2.getname();
	}

}
