package logicalprograms;

public class LargestNoBetween3 
{   
	
  public static void main(String[] args)
  { 
     int a = 84;
     int b = 899;
     int c = 453;
     
     if(a>b)
     {
    	 if (a>c)
    	 {
    		System.out.println("The Largest no is = " + a);
    	 }
         else
         {
        	System.out.println("The Largest no is = " + c);
         }
     }
     else
     {
    	if(b>c)
    	{
    		System.out.println("The Largest no is = " + b);
    	}
        else
        {
         	System.out.println("The Largest no is = " + c);
        } 
     }
	

  }
}


