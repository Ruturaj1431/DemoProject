package inheritance;

public class SubClass2 extends OneSuperClass
{
	public static void main(String[] args) 
     {
   	    SubClass2 y   = new SubClass2();//--> Object Of SubClass2
   	 
        System.out.println(SubClass2.a);
        System.out.println(y.b);
        SubClass2.alpha();
        y.demo();
        
	 }
}
//One SuuperClass Inherited to Two SubClasses