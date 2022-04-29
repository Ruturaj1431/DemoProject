package inheritance;

public class SubClass extends SuperClass
{
   public static void main(String[] args) 
   {
	  SubClass k = new SubClass();
	
	  System.out.println(SubClass.a);
	  System.out.println(k.b);
	  SubClass.alpha();
	  k.demo();
   }
}
