package constructor;

public class AreaOfCircle {
	float r;
	float pie ;
	//Non Argument/Zero Argument Constructor
	public AreaOfCircle() {
		pie=3.14f;
		r=4.5f;
		double area1=pie*r*r;
		System.out.println("Area Of Circle="+area1);
	}
	//Parameterised Constructor
	public AreaOfCircle(float d) {
		pie=7.35f;
		r=4.5f;
		double area=pie*r*r;
		System.out.println("Area Of Circle1="+area);
	}
	public static void main(String[]args) {
		new AreaOfCircle();
		new AreaOfCircle(55.5f);
	}
	

}
