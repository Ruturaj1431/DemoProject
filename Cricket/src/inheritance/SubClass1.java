package inheritance;

public class SubClass1 extends OneSuperClass 
{
     public static void main(String[] args) 
     {
    	 SubClass1 y   = new SubClass1();//--> Object Of SubClass1
    	 
         System.out.println(SubClass1.a);
         System.out.println(y.b);
         SubClass1.alpha();
         y.demo();
         
	 }
}
// One SuuperClass Inherited to Two SubClasses