package variable;

public class LocalVariable {
	public static void main(String[]args) {
		LocalVariable h=new LocalVariable();
		add();
		h.sub();
	
	}
	public static void add(){
		int a=20;
		int b=30;
		System.out.println("The value is="+(a+b));
	}
	public void sub() {
		int a=30;
		int b=40;
		System.out.println("The value is="+(a-b));
	}

}
