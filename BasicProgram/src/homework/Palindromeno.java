package homework;

import java.util.Scanner;

public class Palindromeno {
	public static void main(String[]args) {
		int n=121;
		//Scanner o=new Scanner(System.in);
		//System.out.println("Enter Your Number");
		//n=o.nextInt();
		int l=n;
		int b=0;
		int c;
		while(n>0) { //121
			c=n%10;//1//2//1
			b=b*10+c;//1//12//121
			n=n/10;//12//1//1
		}
		if(l==b) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not Palindrome Number");
		}
	}

}
