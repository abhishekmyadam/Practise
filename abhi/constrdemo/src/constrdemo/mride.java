package constrdemo;

 class mride1 {

	
	
	public void add(){
		
		System.out.println("add two numbers");
	}
}

 class mride2 extends mride1
{
	
	 public void add(){
		 
		 super.add();
		 
		 System.out.println("substract two numbers");
	 }
	 



}
 
 
 
 
 
 
public  class mride{
	
	
	public static void main(String [] args){
		
		
		mride2 obj=new mride2();
		obj.add();
	}
	 
 }

