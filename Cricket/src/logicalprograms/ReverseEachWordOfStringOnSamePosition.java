package logicalprograms;

public class ReverseEachWordOfStringOnSamePosition 
{
  public static void main(String[] args) 
  {
	String s = "Ruturaj Nanda Rajaram Patil";
	
	String[] k =s.split(" ");
	
	for(int i=0;i<k.length;i++)
	{
		String a = k[i];
		
		char[] b = a.toCharArray();
		
		for(int j = b.length-1;j>=0;j--)
		{
			System.out.print(b[j]);
		}
		System.out.print(" ");
		
	}
  }
}
