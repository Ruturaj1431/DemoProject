package logicalprograms;

public class CharacterCountOfString 
{
   public static void main(String[] args) 
   {
	 String a = "Ruturaj Nanda Rajaram Patil";
	 int count=0;
	 
	 for(int i = 0; i<a.length(); i++)
	 {
		 if(a.charAt(i) != ' ' )
		 {
			count++; 
		 }
	 }
	 
	 System.out.println("No of Characters in Given String Are = "+count);
   }
} 


