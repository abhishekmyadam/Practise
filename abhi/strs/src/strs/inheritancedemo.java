package strs;

class animal{
	
	String name;
	String type;
	
	public void display()
	{
	System.out.println("this is parent class");
}
}
class tiger extends animal{
	
//	String name="tiger";
	//String type="carnivas";
	
	//public void display(){
		//System.out.println(name);
		//System.out.println(type);
	
	
}

public class inheritancedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tiger t= new tiger();
		t.name="tiger";
		t.type="carnivas";
		
		t.display();
		
	}

}
