package interfaceconcept;

public class ImplementationClass implements Interface1
{
  public void test() 
  {
   System.out.println("Abstract Method Of Interface");
  }
  
  public void demo()
  {
   System.out.println("Abstract Method Of Interface");
  }
  
  public void defaultMethod() //Over-riding Of Default Method
  {
   System.out.println("Over-riding Of Default Method");  
  }
}
