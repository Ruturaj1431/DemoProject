package interfaceconcept;

public class ExecutionClass 
{
  public static void main(String[] args) 
  {   
	  //Object Of Implementation Class
	  ImplementationClass k = new ImplementationClass();
	  
	  k.defaultMethod();// calling After Over-Riding
	  k.test();
	  k.demo();
	  Interface1.staticMethod();
	  System.out.println(ImplementationClass.a);
  }
}
