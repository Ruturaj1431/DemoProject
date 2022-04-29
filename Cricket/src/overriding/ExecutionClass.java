package overriding;

public class ExecutionClass 
{  
	public static void main(String[] args) {
		
	
	SuperClass k = new SuperClass();//--> Object Of Super Class
    k.test();
    
    SubClass s = new SubClass();//--> Object Of Sub Class
    s.test();
	}
}
