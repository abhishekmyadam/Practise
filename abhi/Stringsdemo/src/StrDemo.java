
public class StrDemo {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
 
String s1="Lorenzo called off his trip to visit Mexico City just because they told him the conquistadores were extinct";
	
System.out.println(s1.toUpperCase());  
       System.out.println(s1.toLowerCase());
       System.out.println(s1.substring(15, 71));
       System.out.println(s1.substring(8));
System.out.println(s1.indexOf('L'));
System.out.println(s1.indexOf('c'));
System.out.println(s1.indexOf('o'));
System.out.println(s1.indexOf('h'));
System.out.println(s1.indexOf('q'));
System.out.println(s1.indexOf('j'));
System.out.println(s1.indexOf('b'));
System.out.println(s1.indexOf('t'));
System.out.println(s1.indexOf('v'));
System.out.println(s1.indexOf('h'));
System.out.println(s1.indexOf('t'));
System.out.println(s1.indexOf('u'));
System.out.println(s1.indexOf('s'));
System.out.println(s1.indexOf('M'));
System.out.println(s1.lastIndexOf('h'));
System.out.println(s1.length());
	System.out.println(s1.replaceAll("l","m"));
System.out.println(s1.trim());
System.out.println(s1.replace('L', 'K'));

String s2=new String("The July sun caused a fragment of black pine wax to ooze on the velvet quilt");
System.out.println(s2.length());
System.out.println(s1.compareTo(s2));
String s3= s1 + "" + s2;
System.out.println(s3);
String s5=s1.concat(s2);
System.out.println(s5);
System.out.println(s3.toUpperCase());
System.out.println(s5.toLowerCase());
	System.out.println(s3.equals(s5));
	System.out.println(s3.equalsIgnoreCase(s5));
	System.out.println(s3.length());
	System.out.println(s3.charAt(15));
	//System.out.println(s5.charAt(lastIndexOf(17)));//
	
	}
	

}
