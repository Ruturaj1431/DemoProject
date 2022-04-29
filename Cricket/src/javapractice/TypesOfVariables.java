package javapractice;

public class TypesOfVariables 
{    //Global Variables--> Scope Of Global Variables is Throughout The Program
	
    static int a = 10; // Global Class(Static) Variable
           int b = 20; // Global Instance(Non-Static) Variable
           
    TypesOfVariables() //Constructor name must be As Same As Class Name
     {
    	 int d = 40; // local Variable
    	 int k =60;  // local Variable
    	 
    	 System.out.println(d); //Scope Of Loacal Varibles Are Only Within the Constructor/method/Block in which we declare them
    	 System.out.println(k); // So Lacal variables has to be called inside their Constructor/method/Block Only
     }
    
    
    public static void main(String[] args) 
    {
    	 TypesOfVariables x = new TypesOfVariables(); //Object Creation
    	    
    	 System.out.println(x.b);
    	 System.out.println(a);
    	    
	}
   
}
