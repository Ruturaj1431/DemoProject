package overloading;

public class ExecutionClass 
{
  public static void main(String[] args) 
  {
	SuperClass.demo();
	SuperClass.demo(50);
	
	SuperClass s = new SuperClass();
	
	s.test();
	s.test(10);
	
   }
}
