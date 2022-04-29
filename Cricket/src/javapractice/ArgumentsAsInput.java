package javapractice;

public class ArgumentsAsInput 
{
   static void test(int a, int b) //Arguments As Input to the method
   {
	   int c = a + b;
	   System.out.println(c);
   }
   
   
   public static void main(String[] args) 
   {
      test(20,50);
      test(40,60);
      test(80,50);
   
   }
   
}
