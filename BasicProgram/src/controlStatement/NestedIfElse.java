package controlStatement;

public class NestedIfElse {
	public void m1() {
		String un="Kiran27";
		String pwd="123k";
		if(un=="Kiran27") {
			if(pwd=="123k") {
				System.out.println("User logged successfully!");
			}
			else {
				System.out.println("You have entered wrong password");
			}
		}
		else {
			System.out.println("You have entered Wrong Username ");
		}
	}
	public static void main(String[]args) {
		NestedIfElse e=new NestedIfElse();
		e.m1();
	}
	

}
