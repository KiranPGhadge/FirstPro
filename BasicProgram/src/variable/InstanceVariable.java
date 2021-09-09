package variable;

public class InstanceVariable {
	int a=24;
	int b=2;
	
	public static void main(String[]args) {
		
		InstanceVariable v=new InstanceVariable();
		v.mul();
		
	}
	public void mul()
	{
		System.out.println("Value of mul="+(a*b));
		System.out.println("Value of add="+(a+b));
		System.out.println("Value of sub="+(a-b));
	}
	

}
