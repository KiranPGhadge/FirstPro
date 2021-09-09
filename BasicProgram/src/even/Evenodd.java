package even;
import java.util.Scanner;
public class Evenodd {
	int a;
	public void eve() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Your Number:");
		a=s.nextInt();
		s.close();
	    if(a%2==0) {
	    	System.out.println("The number is even.");
	    }
	    else {
	    	System.out.println("The number is odd.");
	    }
	}
	public static void main(String[]args) {
		Evenodd e=new Evenodd();
		e.eve();
	}

}
