package abstractclasss;

public class ConcreteClass extends AbstractClass 
{
  void test()
  {
	System.out.println("Test Method of Abstract Class");
  }
  
  void beta()
  {
    System.out.println("Beta Method of Abstract Class");  
  }
  
  void alpha()// Over-Riding Of Non-static Complete Method Of Abstract Class
  {
	System.out.println("Over-Riding Of Non-static Complete Method Of Abstract Class");   
  }
}
