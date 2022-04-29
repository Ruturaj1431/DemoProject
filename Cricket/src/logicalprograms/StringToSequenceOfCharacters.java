package logicalprograms;

public class StringToSequenceOfCharacters 
{
   public static void main(String[] args) 
   {
	  String s = "Ruturaj";
	  
	  char[] a = s.toCharArray();
	  
	  for(int i=s.length()-1;i>=0;i--)
	  {
		  System.out.print(a[i]);
	  }
	   
   }
}
