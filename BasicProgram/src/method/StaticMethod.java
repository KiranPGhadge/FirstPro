package method;

public class StaticMethod {
	public static void add() {
		System.out.println(42+22);
	}
	public static void sub() {
		System.out.println(42-22);
	}
	public static void main(String[] args) {
		add();
		sub();
	}
}