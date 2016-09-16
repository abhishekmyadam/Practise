package strs;

public class twoconstr {

	int a,b;
	
	twoconstr(){
		
	//public void display()
	
		System.out.println("default one constructor");
	
	
	}
	twoconstr(int x, int y){
		
	a=x;
	b=y;
	
	System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	twoconstr ts=new twoconstr(10,20);
	twoconstr td=new twoconstr();


	
	
	}

}
