package method;

public class NonStatic {
	public static void demo1() {
		System.out.println("Hello");
	}
	public void demo2() {
		System.out.println("welcome");
	}
	public void mul() {
	System.out.println(2*40);
	}
public static void main(String[] args) {
	demo1();
	NonStatic v =new NonStatic();
	v.mul();
	v.demo2();
}
}
