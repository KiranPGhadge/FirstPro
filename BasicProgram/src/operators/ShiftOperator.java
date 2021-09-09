package operators;

public class ShiftOperator {
        public static void main(String[]args) {
        	ShiftOperator x=new ShiftOperator();
        	x.l1();
        	x.l2();
        }
        public void l1() {
        	int i=10;
        	int c=20;
        	System.out.println(i<<2);//10 * 2^2=40
        	System.out.println(c<<2);//20 *2^2=80
        	System.out.println(i<<3);//10 *2^3=80
        	System.out.println(c<<4);//20 *2^4=320
        }
        public void l2() {
        	int a=30;
        	int b=40;
        	System.out.println(a>>2);//30 / 2^2=7
        	System.out.println(b>>2);//40 /2^2=10
        	System.out.println(a>>3);//30 /2^3=3
        	System.out.println(b>>4);//40 / 2^4=2
        	
        }
}
