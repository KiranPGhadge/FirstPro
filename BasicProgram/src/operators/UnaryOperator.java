package operators;

public class UnaryOperator {
	 int a=100;
	 int b=200;
	public static void main(String[]args) {
		UnaryOperator c=new UnaryOperator();
		c.m1();
		c.m2();
	}
    public void m1() {
     	System.out.println(+a);//
     	System.out.println(+b);
    	System.out.println(a++);//100(100+1=101)
    	System.out.println(++a);//1+101=102
    	System.out.println(b++);
    	System.out.println(++b);
    }
    public void m2() {
    	int a=100;
    	int b=200;
    	System.out.println(-a);//-100
     	System.out.println(-b);//-200
    	System.out.println(a--);//100(100-1=99)
    	System.out.println(--a);//98
    	System.out.println(b--);
    	System.out.println(--b);
    	
    	
    	
    }
}
