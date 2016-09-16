package strs;

public class str4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		StringBuffer sb= new StringBuffer("The quick brown fox jumps over the lazy dog");
		 System.out.println(sb.substring(10, 19));
		 System.out.print(sb.reverse());
		StringBuffer sb1= new StringBuffer("The quick brown fox");
		 System.out.println();
	System.out.println(sb1.append("jumps over the lazy dog"));	

	StringBuffer sb2= new StringBuffer("The quick brown fox jumps over the lazy dog");
	 
	System.out.println(sb2.replace(0, 9, " "));

	StringBuffer sb3= new StringBuffer("The quick brown fox jumps over the lazy dog");
	System.out.println(sb3.delete(0, 9)) ;

	S tringBuffer sb4= new StringBuffer("The quick brown fox jumps over the lazy dog");
	 System.out.println(sb4.deleteCharAt(10));
	 
	
	}
		
	}


