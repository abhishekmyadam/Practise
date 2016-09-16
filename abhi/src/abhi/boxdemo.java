package abhi;


public class boxdemo {
	
    double width;
	double height;
	double depth;
	public static void main(String args[])
	{
	
	boxdemo mybox1= new boxdemo();
   boxdemo mybox2=new boxdemo();
	double vol;
   
	mybox1.width=7;
    mybox1.height=10;
    mybox1.depth=20;
    
    mybox2.width=15;
    mybox2.height=12;
    mybox2.depth=10;
    vol=mybox2.width*mybox1.height*mybox2.depth;
    System.out.println("vol is" +vol);
	
	

	}
	


}
