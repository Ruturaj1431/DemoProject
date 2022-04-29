package javapractice;

public class Array 
{
   public static void main(String[] args) 
     
 {
    int [] a = {15,38,97,16,35,18,81};
		
	 //To Print Array As It Is
		
	for (int i=0; i<a.length;i++)
    {
	  System.out.print(a[i]+ ",");
    }
	
	System.out.println();
	System.out.println("----------------------");
	//To Print Array Reversely
	
	for (int i=a.length-1;i>=0;i--) 
	{
	  System.out.print(a[i]+ ","); 
	}
 }
}
