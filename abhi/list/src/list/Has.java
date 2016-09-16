package list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Has {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs=new HashSet<String>();
		hs.add("c");
		hs.add("e");
		hs.add("a");
		hs.add("b");
		
		for(String hh:hs){
			System.out.println(hh);
		}
		LinkedHashSet<String> ls=new LinkedHashSet<String>();
		ls.add("f");
		ls.add("h");
		ls.add("g");
		ls.add("z");
		for(String s:ls){
		System.out.println(s);
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("z");
		ts.add("f");
		ts.add("c");
		ts.add("m");
		for(String q:ts){
		System.out.println(q);
		}
		}
		
		}
		
	}


