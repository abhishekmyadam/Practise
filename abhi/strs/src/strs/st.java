package strs;

public class st {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

String s1 = "Lorenzo  called off his trip to visit Mexico City just because they told him the conquistadores were extinct";
	
	System.out.println(s1.toUpperCase());  
	System.out.println(s1.toLowerCase());
	System.out.println(s1.substring(15,71));
	System.out.println(s1.substring(8,107));
	
	System.out.println(s1.indexOf('L')); // index values //
	System.out.println(s1.indexOf('C'));
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

	
	System.out.println(s1.lastIndexOf('L')); //last index values //
	System.out.println(s1.lastIndexOf('C'));
	System.out.println(s1.lastIndexOf('o'));	
	System.out.println(s1.lastIndexOf('h'));
	System.out.println(s1.lastIndexOf('q'));
	System.out.println(s1.lastIndexOf('j'));
	System.out.println(s1.lastIndexOf('b'));
	System.out.println(s1.lastIndexOf('t'));
	System.out.println(s1.lastIndexOf('v'));
	System.out.println(s1.lastIndexOf('h'));
	System.out.println(s1.lastIndexOf('t'));
	System.out.println(s1.lastIndexOf('u'));
	System.out.println(s1.lastIndexOf('s'));
	System.out.println(s1.lastIndexOf('M'));
	
	System.out.println(s1.length());  		 // total length of the string //
	System.out.println(s1.replaceAll("L","M")); // replacing the letter 'L' with 'M'//
	System.out.println(s1.trim()); 			 // omits the white spaces in the string //
	System.out.println(s1.replace('L','K')); // replaces the letter 'L' with 'K' //
	
	String s2 = new String("The July sun caused a fragment of black pine wax to ooze on the velvet quilt");
	System.out.println(s2.compareTo(s1));
	String s3 = (s1 +""+ s2); 				// string concatenation using + operator //
	System.out.println(s3);
	String s4=s1.concat(s2); 				// string concatenation using method //
	System.out.println(s4); 				// displays the string s4 //
	System.out.println(s3.toUpperCase()); 	// displays the string s3 to upper case //
	System.out.println(s4.toLowerCase()); 	// displays the string s4 to lower case //
	System.out.println(s3.equals(s4));  	// s3 and s4 are same so it is true //
	System.out.println(s3.equalsIgnoreCase(s4)); 
	System.out.println(s3.length()); 		// displays the length of string s3 //	
	System.out.println(s3.charAt(15)); 		// displays character at position 15 //
	System.out.println(s4.length());		// displays the length of string s4 //
	System.out.println(s4.charAt(90));// 		// displays character at position 17 //
	
	}

	private static void Concate(String s1, String s2) {
		// TODO Auto-generated method stub
		
	}

}
