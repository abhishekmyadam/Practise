package list;

import java.util.LinkedList;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> ll=new LinkedList<String>();
ll.add("d");
ll.add("b");
ll.add("c");
ll.add("a");
ll.removeFirst();
for(int j=0;j<ll.size();j++){
	
	System.out.println(ll.get(j));
}
	}

}
