package constructor;

public class Methodcall {
	public static void test() {
		System.out.println("I am Static");
	}
	public void test2() {
		System.out.println("I am Non-Static");
	}
    public static void main(String[] args) {
		test();
		Methodcall m=new Methodcall();
		m.test2();
	}
}
