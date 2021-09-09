package homework;

public class Fibonacciseries {
	public static void main(String[]args) {
		int a=1;
		int b=1;
		int c=12;
		int n=0;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<=c;i++) {
			n=a+b;
			a=b;
			b=n;
			System.out.print(n+" ");
		}
	}

}
