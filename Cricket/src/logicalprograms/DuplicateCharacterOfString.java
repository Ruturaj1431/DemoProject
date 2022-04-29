package logicalprograms;

public class DuplicateCharacterOfString 
{
   public static void main(String[] args) 
   {
	 String a = "ruturaj";
	
	 
	 System.out.println("Duplicate Characters Of given String :");
	 
	 for(int i = 0; i<a.length(); i++)
	 {
		 for(int j=i+1;j<a.length();j++)
		 {
			 if(a.charAt(i)==a.charAt(j))
             {  
	            System.out.println(a.charAt(j));
	            
             }
		 }
	 }
   }
}
