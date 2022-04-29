package javapractice;

public class ReturnType 

{
       int Demo(int a, int b) //Arguments As Input to the method
	   {
		   int c = a + b;
		   return c;       // Output From The Method
	   }
	   
	   
	   public static void main(String[] args) 
	   {    
		  ReturnType y = new ReturnType();
	      int k = y.Demo(20,50); // 
	      int z = y.Demo(40,60);
	      int f = y.Demo(80,50);
	      
	      System.out.println(k);  
	      System.out.println(z);
	      System.out.println(f);
	   
	   }
}
