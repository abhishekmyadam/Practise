package strs;

public class paramcons {

	int id;
	String name;
	paramcons(int x, String y){
		id=x;
		name=y;
		System.out.println(id);
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
	
		paramcons pc=new paramcons(04, "parameterixedconstructor");
		
	}

}
