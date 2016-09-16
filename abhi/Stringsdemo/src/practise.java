
public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Here i am the PRince";
		
		String s2="Prince is Abhishek";
		System.out.println(s1);
		s1=s1.toUpperCase();
		System.out.println(s1.hashCode());
		s1=s1.toLowerCase();
		System.out.println(s1.hashCode());
		System.out.println(s1.concat(s2));
		String s4 = new String("this is abhi" + "" + "shake");
		
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s1.compareTo(s2));
System.out.println(s1.indexOf('a'));
System.out.println(s1.length());
System.out.println(s2.length());
System.out.println(s1.substring(4,9));
System.out.println(s1.hashCode());
		s1=s1.replace('i','w');
System.out.println(s1);
s1=s1.replaceAll("e","i");
System.out.println(s1);
	}

}
