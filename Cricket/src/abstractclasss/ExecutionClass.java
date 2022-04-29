package abstractclasss;

public class ExecutionClass 
{
	public static void main(String[] args) 
	{
		ConcreteClass k = new ConcreteClass();// Object Of Concrete Class
		k.alpha(); // Calling After Over-Riding
		k.test();
		k.beta();
		ConcreteClass.demo();
		AbstractClass.demo();
	}
	
   
}
