package interfaceconcept;

public interface Interface1 
{  int a = 50; // Public,Static And Final Variable Of Interface
   static void staticMethod()
   {
	 System.out.println("Static Complete Method Of Interface");
   }
   
   default void defaultMethod()
   {
	 System.out.println("Default Complete Method Of Interface"); 
   }
   
   void test();//Abstract Methods Of Interface
   void demo();
}
