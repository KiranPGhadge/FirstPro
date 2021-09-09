package constructor;

public class ConsMethod {
	int c=10;
	int d=30;
	public static void main(String[]args) {
		ConsMethod x=new ConsMethod(20,30);//argument passed to cons.
		x.ConsMethod1();
		//new ConsMethod(20,30); not needed
		
	}
	public void ConsMethod1() {
		System.out.println(c*d);
		System.out.println("Hello");
	}
	public ConsMethod(int b,int d) {
		System.out.println(b+d);
		System.out.println(c+d);
		System.out.println("Welcome");
	}
    
}
