package logicalprograms;

public class DuplicateStringFromArray 
{
  public static void main(String[] args) 
  {
	String [] a = {"Hi","Hi", "Hello", "Hello", "How", "are"};
	
	System.out.println("Duplicate Strings From Array Are :");
	for(int i = 0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]==a[j])
			{
				System.out.println(a[j]);
			}
		}
	}
  }
}
