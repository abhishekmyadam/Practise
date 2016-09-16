package strs;

public class person {

	String name, color, add;
	public void display(){
		System.out.println(name);
		System.out.println(color);
		System.out.println(add);
		
	}
	

public static void main(String args[]){
person p1= new person();
p1.name="abc";
p1.color="red";
p1.add="frisco";
p1.display();
}
}

