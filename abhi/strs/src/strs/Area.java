package strs;



public abstract class Area {

	abstract void calculateArea();
	
	
}

  class Circle extends Area{
	  void  calculateArea()
	  {
		  System.out.println("area of circle");
	  }
		
	}
	
      class triangle extends Area{
		 void  calculateArea(){
		System.out.println("area of triangle");
		 }
       }
	   
       class rectangle extends Area{
       
    	   void calculateArea()
    	   {
    		   System.out.println("area of rectangle");
    	   }
       
	
       }
       
       
       
       
       
       
		 
		 
		 
		
	
		
		
	
	
	
	
	

