package hiding;

public class ExecutionClass 
{
public static void main(String[] args) 
{
	SuperClass.demo();//--> Normal Call
	
	//Both Call Gives Same Output
	SubClass.demo();//--> Normal Call
	SubClass.demo();//--> Inheritance Call
}
}
