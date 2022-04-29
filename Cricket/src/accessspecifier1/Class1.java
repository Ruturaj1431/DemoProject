package accessspecifier1;

public class Class1 
{ 
    public String a;
    
    public Class1()
    {
    	a = "Public Constructor";
    }
    
    Class1(int k)
    {
    	a = "Default Constructor";
    }
    
    protected Class1(char z)
    {
    	a = "Protected Constructor";
    }
    
    private Class1(char z, int b)
    {
    	a = "Private Constructor";
    }
	
	public static void main(String[] args) 
	{   
		//All Properties of class can be called Inside Same class
		
		Class1 x = new Class1();
		System.out.println(x.a);
		
		Class1 y = new Class1(50);
		System.out.println(y.a);
		
		Class1 z = new Class1('$');
		System.out.println(z.a);
		
		Class1 s = new Class1('$', 50);
		System.out.println(s.a);
	}
	
}
	
	
	/* ==========================================================================
	 public int a = 10; // ----- Non-Static Properties a,b,c,d
            int b = 20;
  protected int c = 30;
    private int d = 40;  
    
      
        2)For Non Static Variables
    	Class1 x = new Class1();// ---- Object Creation
    	
    	All Properties of class can be called Inside Same class
    	
    	System.out.println(x.a); 
    	System.out.println(x.b);
    	System.out.println(x.c);
    	System.out.println(x.d);
=========================================================================    	
        1)For Static Properties
    	All Properties of class can be called Inside Same class
    	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
=================================================================================
        public static void alpha()
	{
		System.out.println("Alpha is Public Method");
	}
	
	static void test() 
	{
		System.out.println("Test is Default Method");
	}
	
	protected static void demo()
	{
		System.out.println("Demo is Protected Method");
	}
	
	private static void beta() 
	{
		System.out.println("Beta is Private Method");
	}
	
	3)For Non-Static Method
        
		All Properties of class can be called Inside Same class
		
		Class1 x = new Class1(); //---- Object Creation
		
		x.alpha();
		x.test();
		x.demo();
		x.beta();	
====================================================================================
	    4)For Static Methods
	    
		All Properties of class can be called Inside Same class
		
		alpha();
		test();
		demo();
		beta();
=========================================================================================
	*/
	
