package constrdemo;

public class Person {
	
	int x;
	String y;
	Person()
	{
	
		System.out.println("this is default constructor");
	System.out.println(x);
	System.out.println(y);
	}
	
	
	Person(int p,String n)
	{
		x=p;
		y=n;
		System.out.println("this is parameterized  constructor");
		System.out.println(p);
		System.out.println(n);
		System.out.println(x);
		System.out.println(y);
	}

}

