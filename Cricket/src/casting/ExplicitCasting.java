package casting;

public class ExplicitCasting 
{
    //Explicit Casting- Higher to lower Datatype
	public static void main(String[] args) 
	{
		double d = 18.88;
		int a; 
		a = (int)d;
		
		System.out.println(d);
		System.out.println(a);
		
		System.out.println("----------------------------------");
		
		short x = 125;
		byte y;
		y=(byte)x;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("----------------------------------");

		
		short k = 129;
		byte m;
		m = (byte)k;
		
		System.out.println(k);
		System.out.println(m);
	}
}
