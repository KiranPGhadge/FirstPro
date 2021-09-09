package homework;

import java.util.Scanner;

public class Primeno {
	public static void main(String[]args) {
		int no=13;
		
		//Scanner s=new Scanner(System.in);
		//System.out.println("Enter Your Number:");
		//int no=s.nextInt();
		//s.close();
		boolean b=false;
		for(int i=2;i<no;i++) {
		if(no%i==0 && no%1==0) {
	       b=true;
		}
		}
		if(b) {
	     System.out.println("Number is not prime number");
		}
		else {
			System.out.println("It is a prime number");	
		}
		}
	}


