package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class BOFa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Bank one=new Bank();
		one.setAccountholderName("abhishek");
		one.setAccounttId(1);
		
		Bank two=new Bank();
two.setAccountholderName("shake");
two.setAccounttId(2);


/*ArrayList<Bank> obj=new ArrayList<Bank>();
obj.add(one);
obj.add(two);
for(int i=0;i<obj.size();i++){
	System.out.println(obj.get(i).getAccountholderName());
	System.out.println(obj.get(i).getAccounttId());*/
	
	
LinkedList<Integer> obj1=new LinkedList<Integer>();
obj1.add(3);
obj1.add(1);
obj1.add(2);
obj1.add(3);
obj1.add(3);

for(int j=0;j<obj1.size();j++)
{
System.out.println(obj1.get(j));

}



	}
	}

