package operators;

public class ArithmeticOperator {
	int a=12;
	float b=5;
	public static void main(String[]args) {
		ArithmeticOperator v=new ArithmeticOperator();
		v.a1();
		v.a2();
	}
    public void a1() {
    	System.out.println("add="+(a+b));
    	System.out.println("sub="+(a-b));
    }
    public void a2() {
    	System.out.println("mul="+(a*b));
    	System.out.println("div="+(a/b));
    	System.out.println("per="+(a%b));
    	
    }
}
