package logicalprograms;

public class DuplicateNoFromArray 
{
   public static void main(String[] args) 
   {
      int [] k = { 20,30,10,20,40,40,30,50,35,35};
      
    
      System.out.println("Duplicate elements in given array:");
      
      for(int i = 0; i<k.length; i++)
      {
    	  for(int j = i+1; j<k.length; j++)
    	  {
    		  if(k[i]==k[j])
    		  {   
    			  System.out.println(k[j]);
    		  }
    		  
    	  }
      }
   }
}  
   

