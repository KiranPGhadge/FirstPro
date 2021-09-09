package controlStatement;

public class IFstatement {
	int c=10;
	public void call() {
		//std.syntax
		//if(condition){}
		if(c<=10) {
			System.out.println("True Value");
		}
	}
	public void call2() {
		System.out.println("welcome");
	}
	public static void main(String[]args) {
		IFstatement i=new IFstatement();
		i.call();
		i.call2();
	}

}
