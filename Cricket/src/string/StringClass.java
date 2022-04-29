package string;

public class StringClass 
{
   
   public static void main(String[] args) 
   {
     String a = "Virat --> The Run-Machine Kohli";
     String b = "Virat --> The Run-Machine Kohli";
   
     String c = new String("Virat --> The Run-Machine Kohli");
     String d = new String("Virat --> The Run-Machine Kohli");
  
	  System.out.println(a == b);
	  System.out.println(c == d);	  
	  
   }
}
