package constructor;

public class AreaOfSquare {
	public static void oneSquare(long k) {
		long t=k;
		System.out.println("Area of oneSquare="+t);
	}
	public static void oneSquare(int k,int d) {
		long h=k*d;
		System.out.println("Area of oneSquare="+h);
	}
	public static void twoSquare(int d) {
		long k=d*d;
		System.out.println("Area of twoSquare="+k);
	}
	public void song(String s) {
		System.out.println("Play Arjit Song "+s);
		
	}
	public static void main(String[]args) {
		oneSquare(10);
		oneSquare(10,5);
		twoSquare(6);
		AreaOfSquare g=new AreaOfSquare();
		g.song("Tu Hi Yaar Mera");
	}
}
