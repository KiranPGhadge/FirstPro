package constructor;

public class Constructor {
	//Declaration
	static int a;
	
	//Initializtion
	public Constructor() {
		a=20;
		System.out.println("The Value of a="+a);
	}
	public Constructor(boolean b) {
		a=2000;
		System.out.println("The Value of a="+a);
	}
	public Constructor(int b,String s) {
		a=300;
		long t=b*b;
		System.out.println("The Value of t="+t);
		System.out.println("The Value of a="+a);
		System.out.println("The Value of b="+b);
		System.out.println("The Value of s="+s);
	}
	public Constructor(long d,String p) {
		a=2;
		System.out.println("The Value of a="+a);
		System.out.println("The Value of d and p ="+d +"\n"+p);
	}
	public Constructor(float o ,String p) {
		a=50;
		System.out.println("The Value of a="+a);
		System.out.println("The Value of o and p=" +o+"\n"+p);
	}
	//usage
	public static void main(String[]args) {
		new Constructor();
		new Constructor(false);
		new Constructor(5,"Hello");
		new Constructor(20000000000l,"How are you?");
		new Constructor(200f,"where are you?");
	}	
	}


