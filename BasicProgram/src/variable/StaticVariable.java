package variable;

public class StaticVariable {
	static int c=10;
	static int d=1000;
	
	public static void main(String[]args) {
		mul();
		StaticVariable s=new StaticVariable();
		s.add();
		
	}
	public static void mul(){
		System.out.println("Multiplication= "+(c*d));
		
	}
	public  void add() {
		System.out.println("Addition="+(c+d));
	}
	

}
