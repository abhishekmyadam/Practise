package list;

import java.util.Vector;

public class Vec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector<String> V=new Vector<String>();
		V.add("a");
		V.add("b");
		V.add("C");
	for(int i=0;i<V.size();i++){
		System.out.println(V.get(i));
	}
	}

}
