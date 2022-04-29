package logicalprograms;

public class LargestNoBetween4
{   
	
  public static void main(String[] args)
  { 
     int a = 83;
     int b = 95;
     int c = 43;
     int d = 79;
     
     if(a>b)
     {
    	 if (a>c)
    	 {
    		if(a>d)
    		{
    		  System.out.println("The Largest no is = " + a);
    		}
    		else
    		{
    		  System.out.println("The Largest no is = " + d);
    		}
    	 }
    	 else
    	 {
    	    if(c>d)
    	    {
    	      System.out.println("The Largest no is = " + c);
    	    }
    	    else
    	    {
    	      System.out.println("The Largest no is = " + d);
    	    } 
    	 }
     }
     else
     {
       if(b>c) 
        {
           if(b>d) 
        	{
        	   System.out.println("The Largest no is = " + b);	
        	}
        	else
        	{
        	   System.out.println("The Largest no is = " + d);
        	}
        		
        }
        else
        {
          if(c>d)
          {
              System.out.println("The Largest no is = " + c);
          }
          else
          {
              System.out.println("The Largest no is = " + d);
          } 
         }
        	
         }
     }
    
	
      
 }


