package operators;

public class LogicalAndBitwiseAnd {
	static int a=200;
	static int b=300;
	public static void main(String[]args) {
		LogicalAndBitwiseAnd s=new LogicalAndBitwiseAnd();
		s.a1();
		s.a2();
	}
	//Logical And
    public void a1() {
    	System.out.println(a>b && b<a);//
    	System.out.println(a<b && b<a);
    	System.out.println(a>b && b>a);
    	System.out.println(a<b && b>a);
    }
    //Bitwise And
    public void a2() {
    	System.out.println(a>b & b<a);
    	System.out.println(a<b & b<a);
    	System.out.println(a>b & b>a);
    	System.out.println(a<b & b>a);
    }
}
