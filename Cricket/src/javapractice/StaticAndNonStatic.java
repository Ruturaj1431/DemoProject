package javapractice;

public class StaticAndNonStatic 

{  static int a = 45;  // Static variable
          int b = 75;  // Non-Static variable
           
        StaticAndNonStatic()   // Constructor With Same Name As "Class Name"
        {
        	a = 39;
        	b = 86;
        }
        
        StaticAndNonStatic(int k)   // Constructor(int type Argument) With Same Name As "Class Name"
        {
        	a = 57;
        	b = 64;
        }
        
       public static void main(String[] args) 
       {
		System.out.println(a);  // Initial value Of variable "a"
		System.out.println("-----------------------");
		
		StaticAndNonStatic x = new StaticAndNonStatic(); // Constructor call--> Object Creation
		
		System.out.println(a);  // Value Of "a" After Creating Object "x"
		System.out.println(StaticAndNonStatic.a); // Calling Static Variable "a" by using ClassName
		System.out.println(x.b); // Value Of Non-static Variable "b" After Creating Object "x"
		
		System.out.println("-----------------------");
		
		StaticAndNonStatic y = new StaticAndNonStatic(52); //Constructor call(int type Argument)--> Object Creation
		
		System.out.println(a); // Value Of "a" After Creating Object "y"
		System.out.println(StaticAndNonStatic.a); // Calling Static Variable "a" by using ClassName
		System.out.println(y.b); // Value Of Non-static Variable "b" After Creating Object "x"
		
		System.out.println("-----------------------");
		
		x.b= 145; // Assigning new value to x.b
		y.b= 198; // Assigning new value to y.b
	    System.out.println(x.b); //Printing Value
	    System.out.println(y.b); //Printing Value
	   }
}
