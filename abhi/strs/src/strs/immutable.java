package strs;

public class immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s1= "some";
	System.out.println(s1);
	System.out.println(s1.hashCode());
	s1= s1.replace('s','t');
	System.out.println(s1.hashCode());
s1=s1.replace('o','f');
System.out.println(s1);
System.out.println(s1.hashCode());
	}
	

}
