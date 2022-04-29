package accessspecifier1;

public class Class2
{
	public static void main(String[] args) 
	{   
		Class1 x = new Class1();
		System.out.println(x.a);
		
		Class1 y = new Class1(50);
		System.out.println(y.a);
		
		Class1 z = new Class1('$');
		System.out.println(z.a);
		
		//Class1 s = new Class1('$', 50); // ----Private Constructor Cannot be Called Outside Class
		//System.out.println(s.a);
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	 /* ========================================================================================================
		    2) For Non-Static variable   
		    Class1 x = new Class1();// ---- Object Creation
	        
	        Calling Of Properties In different Class Of Same Package
	    	
	    	System.out.println(x.a); 
	    	System.out.println(x.b);
	    	System.out.println(x.c);
	    	System.out.println(x.d); // ----Private Property Cannot be Called Outside Class
=========================================================================================================  	    	
	        1) For Static Variable   
	        
	        Calling Of Properties In different Class Of Same Package
		  
			System.out.println(Class1.a);
			System.out.println(Class1.b);
			System.out.println(Class1.c);
			System.out.println(Class1.d);// Private Property Cannot be Called Outside Class
==============================================================================================================			
		    3) For Non-Static Method
		    
		    Class1 x = new Class1();// ---- Object Creation
		
            Calling Of Properties In different Class Of Same Package
        
		    x.alpha();
		    x.test();
	    	x.demo();
		    x.beta(); //Private Method Cannot be Called Outside Class
============================================================================================================		    
	        4) For Static Methods
	        
	        Calling Of Properties In different Class Of Same Package
		
		    Class1.alpha();
		    Class1.test();
		    Class1.demo();
		    Class1.beta(); // Private Property Cannot be Called Outside Class
================================================================================================================	
	*/
