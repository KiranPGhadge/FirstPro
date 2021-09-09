package operators;

public class UnaryOperator1 {
	public static void main(String[]args) {
		UnaryOperator1 e=new UnaryOperator1();
		e.c1();
	}
	public void c1() {
		int d=10;
		boolean b=true;
		boolean c=false;
		System.out.println(~d);//((-10)-1=-11)
	    System.out.println(!b);
	    System.out.println(!c);
	}

}
