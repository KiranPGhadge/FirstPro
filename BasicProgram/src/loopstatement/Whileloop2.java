package loopstatement;

public class Whileloop2 {
	public static void main(String[]args) {
		int n=5211;
		int s=0;
		int t;
		while(n>0) {
			t=n%10;//1,1,2,5
			s=s*10+t;//1,11,112,1125
			n=n/10;//521,52,5,0
	}
		System.out.println(s);
	}

}
