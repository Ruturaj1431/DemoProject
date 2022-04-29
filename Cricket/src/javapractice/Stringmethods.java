package javapractice;

public class Stringmethods 
{
   public static void main(String[] args) 
   {
	String a = "VIRAT";
	String b = "Virat THE RUN MACHINE Kohli";
	String c = "         Virat THE RUN MACHINE Kohli        ";
	String d = "Virat One Kohli One King One Of One Cricket";
	
	//1) This method Considers CASE of String While doing comparison
		System.out.println(a.equals("VIRAT")); 
		System.out.println(a.equals("virat"));
		
		System.out.println("------------------------------------------------");
		
	//2) This method does not Consider CASE of String While doing comparison
		System.out.println(a.equalsIgnoreCase("ViRat"));
		
		System.out.println("------------------------------------------------");
		
	//3) This method Converts String Into UPPERCASE
		System.out.println(b.toUpperCase());
		
		System.out.println("------------------------------------------------");
		
	//4) This method Converts String Into LOWERCASE
		System.out.println(a.toLowerCase());
		
		System.out.println("------------------------------------------------");
		
    //5) This Method Joins ONE String With Another
		System.out.println(a.concat(" KING"));
		System.out.println(a + " KING");
		
		System.out.println("------------------------------------------------");
		
	//6) This Method Gives length Of String
		System.out.println(a.length());
		
		System.out.println("------------------------------------------------");
	
    //7) This Method Gives Character At Particular Index Number
		System.out.println(b.charAt(10)); //index=length-1
		
		System.out.println("------------------------------------------------");
		
	//8) To print String Reversely
		
		for(int i=b.length()-1;i>=0;i--)
		{
			System.out.print(b.charAt(i));
		}
		System.out.println();
		
		System.out.println("------------------------------------------------");
		
	//9) To ACtually Reverse The String
		String t="";
		for(int i=b.length()-1;i>=0;i--)
		{
			t= t + (b.charAt(i));
		}
		System.out.println(t);
		
		System.out.println("------------------------------------------------");
	
	//10)This Method Gives Index Of Character or String Of Characters
		
		System.out.println(b.indexOf("RUN"));
		
		System.out.println("------------------------------------------------");
	
	//11) This Method Gives Last Index Of Given Character Or String Of Characters
		
		System.out.println(b.lastIndexOf("N"));

		System.out.println("------------------------------------------------");
		
	//12) This Method Prints Remaining String After The Given Index Number(Includes Character At Given INDEX)
		
		System.out.println(a.substring(2));
		System.out.println(b.substring(10,20));//It Excludes Character AT Index NO 20 
		
		System.out.println("------------------------------------------------");
		
    //13)This Method removes Space At The Start And End OF String
		System.out.println(c);
		System.out.println(c.trim());
		
		System.out.println("------------------------------------------------");
		
	//14)This Method Splits String From GIven Characters
		String [] k = d.split(" One ");
		
	    for(int i=0;i<k.length;i++)
		{
			System.out.println(k[i]);
		}
	    
	    System.out.println("------------------------------------------------");
	
	 //15) This Method Replaces OLD Character WIth NEW Characters
		System.out.println(b.replace("RUN","KING"));
		
		System.out.println("------------------------------------------------");
		
	//16) This Method Verify that Whether String Starts With given Characters Or NOT
		
		System.out.println(b.startsWith("Virat"));
		System.out.println(b.startsWith("virat"));// CASE Sensitive
		
		System.out.println("------------------------------------------------");
		
	//17) This Method Verify that Whether String ENds With given Characters Or NOT
		
		System.out.println(b.endsWith("Kohli"));
		System.out.println(b.endsWith("kohli"));// CASE Sensitive
	
		System.out.println("------------------------------------------------");
	
	//18) This Method Converts Whole String Into Character Of Array
	
	char [] x = b.toCharArray();
	
	for (int i=0; i<x.length;i++) 
	{
		System.out.println(x[i]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//15) This Method Replaces OLD Character WIth NEW Characters
	
	//System.out.println(b.replace("RUN","KING"));
	
	//16) This Method Verify that Whether String Starts With given Characters Or NOT
	
	//System.out.println(b.startsWith("Virat"));
	//System.out.println(b.startsWith("virat"));// CASE Sensitive
	
	//System.out.println("------------------------------------------------");
	//17) This Method Verify that Whether String ENds With given Characters Or NOT
	
	//System.out.println(b.endsWith("Kohli"));
	//System.out.println(b.endsWith("kohli"));// CASE Sensitive
	
	
	
	
	
	
	
   }
}
