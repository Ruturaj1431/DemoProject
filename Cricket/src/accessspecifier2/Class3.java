package accessspecifier2;

import accessspecifier1.Class1;// Need To import Class1(Package1) In Class3(Package2)

public class Class3 extends Class1  //Inheritance Applied
{
	public static void main(String[] args) 
	{   Class3 m = new Class3();
		
		System.out.println(m.a); // Only Public Constructor can be called outside class
		
		
		//System.out.println(y.a);
		
		
		//System.out.println(z.a);
		
		
		//System.out.println(s.a);
	}
	
		  
		  
		  
	  
}
		  
		  
		  
		  
		  
		  
		  
		  
		  
/* ======================================================================================================================
	   1) For Non-Static Variables
	
       Class3 x = new Class3();// ----Whenever We Apply Inheritance then We Have To Create Object of SubClass Alwayz
     
       Calling Of Properties In different Class Of Different Package
	
	   System.out.println(x.a); 
	   System.out.println(x.b); // Default Property Cannot Be Called Outside Package
	   System.out.println(x.c); // Protected Property Can Be Called Outside Package After Applying Inheritance
	   System.out.println(x.d); // Private Property Cannot be Called Outside Package
	
========================================================================================================================= 
      2) For Static Variables
      		  
	   Calling Of Properties In different Class Of Different Package
	  	  
       System.out.println(Class1.a);
	   System.out.println(Class1.b);// Default Property Cannot Be Called Outside Package
	   System.out.println(Class1.c);// Protected Property Can Be Called Outside Package After Applying Inheritance
	   System.out.println(Class1.d);// Private Property Cannot be Called Outside Package
	
==========================================================================================================================
      3) For Non-Static Methods
      
      Class3 x = new Class3(); //---- Object Of SubClass
          
      Calling Of Properties In different Class Of Different Package
      	
		
	   x.alpha();
	   x.test(); // Default Property Cannot Be Called Outside Package
	   x.demo();   // Protected Property Can Be Called Outside Package After Applying Inheritance
	   x.beta(); //Private Method Cannot be Called Outside Class
=================================================================================================================================
      4) For Static Methods
      
       Calling Of Properties In different Class Of Different Package
		 
		Class1.alpha();
		Class1.test(); // Default Property Cannot Be Called Outside Package
		Class1.demo(); // Protected Property Can Be Called Outside Package After Applying Inheritance
		Class1.beta(); // Private Property Cannot be Called Outside Package   
=======================================================================================================================================        
         
         
         
         
          */
		
