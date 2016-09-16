package strs;

 class parent{
	
	int a, b;
	parent(){
		System.out.println("this is parent constructor");
	}

parent(int x,int y){
	a=x;
	b=y;
	System.out.println(a+b);
}
}

 class child extends parent{
	
	int c,d;
	
	child(){
		System.out.println("this is sub class constructor");
	}
child(int e,int f){
	c=e;
	d=f;
	System.out.println(d-c);

}
}


public class inheritanceconst {

	public static void main(String[] args) {
		child gta=new child();
	
		
		//c1.a=10;
		//c1.b=20;
		//child c2= new child(100,40);
		//c2.c=30;
		//c2.d=40;
		
		//child k1=new child(3,4);
		//k1.child(3,4);
		
		// TODO Auto-generated method stub

	}

}
