package list;

import java.util.HashMap;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(4,"abhi");
		mp.put(3,"bi");
		mp.put(2,"ai");
		mp.put(1,"i");
		
		System.out.println(mp.get(2));
		System.out.println(mp.entrySet());
	System.out.println(mp.keySet());
	
	
	TreeMap<String,String>tm=new TreeMap<String,String>();
	
	tm.put("a","abhi");
	tm.put("c","tiger");
	tm.put("b","lion");
	tm.put("d","king");
	
	System.out.println(tm.get("c"));
	System.out.println(tm.entrySet());
	
	}

}
