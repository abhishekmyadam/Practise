package abhi;

public class demo {
	double width;
	double height;
	double depth;

	double vol()
	{
	return depth*height*width;
	}
	
	demo(double w,double d ,double h){
		width=w;
		depth=d;
		height=h;
	}
	

	public static void main(String args[]){
		
		demo mydemo1=new demo(2,4,6);
		double vol;
		
		
		vol=mydemo1.vol();
		
		
System.out.println("vol is"+vol	);

	
}
}