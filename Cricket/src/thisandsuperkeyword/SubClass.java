package thisandsuperkeyword;

public class SubClass extends SuperClass
{
   int a = 25;
   int b = 30;
   
   void demo()
   {
	   int a = 35;
	   int b = 40;
	   
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(this.a);
	   System.out.println(this.b);
	   System.out.println(super.a);
	   System.out.println(super.b);
   }
}
