package strs;

 class person2 {

	String name;
	String color;
	String address;
 }
class employee extends person2{
	
	int id;
	
	public void display()
	{
		
		System.out.println(name);
		System.out.println(color);
	System.out.println(address);
	System.out.println(id);
	}
}
	public class person1{
	
	public static void main(String[] args) {
	
		employee e= new employee();
		
		e.name="some";
		e.color="red";
		e.address="frisco";
		e.id=123;
	e.display();
	}


}