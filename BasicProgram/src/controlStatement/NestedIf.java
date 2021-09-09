package controlStatement;

public class NestedIf {
	int c=40;
	int d=60;

	public void con1() {
		if(c<d){
			if(c<=40) {
			System.out.println("Grade 3");
			}
		}
	}
	public void con2() {
		if(c<50 && c>35) {
			System.out.println("Excellent");
			if(d>50 && d<65) {
			System.out.println("Grade 1");	
			}
		}
	}
	public void con3() {
		if(c>30||c<25) {
			if(d<40||d>55) {
			 System.out.println("Successful");
			}
		}
	}
	public static void main(String[]args) {
		NestedIf k=new NestedIf();
		k.con1();
		k.con2();
		k.con3();
	}

}
