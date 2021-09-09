package controlStatement;

public class IfElse {
	int digit =10;
	
	public void con1() {
		if(digit>=10) {
			System.out.println("correct Number");
		}
		else {
			System.out.println("wrong Number");
		}
	}
	public void con2() {
		int mark=35;
		if(mark<35) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Pass");
		}
	}
	public static void main(String[]args) {
		 IfElse i=new IfElse();
		 i.con1();
		 i.con2();
	}
}
