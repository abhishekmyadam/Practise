package strs;

public class sam {
int id;
String name;


sam()
{
	System.out.println("parent const");
}

sam(int i,String S)
{
	System.out.println("parametrconstructor");
}


public void display()
{

	System.out.println(name);
}



public static void main(String args[]){
	sam s2= new sam();
	sam s1= new sam(2,"a");
s1.name="abc";
s2.display();

}
}