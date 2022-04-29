package logicalprograms;

public class OddEven 
{

   
   public static void main(String[] args) 
   
   {
	   int [] a = { 15,22,35,48,29,33,56,86};
	   for (int i = 0; i<a.length; i++)
	  {
		  if(a[i]%2==0)
		  {   
			  System.out.println("This number is even = " +a[i] );
		  }
		  else
		  {
			  System.out.println("This number is odd = " +a[i] );  
		  }
	  }
   }
}
