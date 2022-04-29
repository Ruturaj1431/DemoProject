package abstractclasss;

public abstract class AbstractClass 
{
  static void demo() //Complete Static Method of Abstract Class
  {
	  System.out.println("Static Complete Method");
  }
  
  void alpha() // Complete Non-Static Method of Abstract Class
  {
	  System.out.println("Non-Static Complete Method");
  }
  
  abstract void test();// Abstract Methods Of Abstract Class
  abstract void beta();
}
