package operators;

public class LogicalORBitwiseOR {
	static int a=100;
	static int b=200;
	static int c=300;
	public static void main(String[]args) {
		LogicalORBitwiseOR s=new LogicalORBitwiseOR();
		s.a1();
		s.a2();
	}
	//logical OR
	public void a1() {
    	System.out.println(a>b || c<a);//false||false=false
    	System.out.println(a<b || c<b);//true||false=true 
    	System.out.println(a>b || c>a);//false||true=true
    	System.out.println(a<b || c>a);//true||true=true
    }
	  //Bitwise OR
    public void a2() {
    	System.out.println(a>b | c<a);//false||false=false
    	System.out.println(a<b | c<b);//true||false=true 
    	System.out.println(a>b | c>a);//false||true=true
    	System.out.println(a<b | c>a);//true||true=true

    }

}
