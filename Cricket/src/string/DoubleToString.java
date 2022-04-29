package string;

public class DoubleToString 
{
    public static void main(String[] args) {
		
    	double d = 1818;
    	
    	String k = Double.toString(d);
    	
    	System.out.println(k);
    	
    	System.out.println(k.equals("1818.0"));
	}
}
