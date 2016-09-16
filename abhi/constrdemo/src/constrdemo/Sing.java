package constrdemo;

public class Sing
{	
	
	public static void main(String[] args){
		
		String s1="abc";
		String s2=new String("xyz");
	if(s1.equals(s2)){
		System.out.println("they are equl");
		
		
	}
	else{
		System.out.println(s2.compareTo(s1));
		System.out.println("not equal");
		
	}
	if(s1==s2){
		System.out.println("equal");
		
	}
	else {
		System.out.println("some");
	}
	}
	
			
}
