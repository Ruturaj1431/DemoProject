package overloading;

public class SuperClass 
{  //Static Methods
  static void demo() 
  {
	 System.out.println("Static Method With Zero Argument"); 
  }
  
  static void demo(int k) 
  {
	 System.out.println("Static Method With int type Argument"); 
  }
 //---------------------------------------------------------------
  //Non-Static Methods
  void test() 
  {
	 System.out.println("Non-Static Method With Zero Argument"); 
  }
  
  void test(int a) 
  {
	 System.out.println("Non-Static Method With int type Argument"); 
  }
}
