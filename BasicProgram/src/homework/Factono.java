package homework;

import java.util.Scanner;

public class Factono {
	public static void main(String[]args) {
		int num=5;
		//Scanner s= new Scanner(System.in);
		//System.out.println("Enter a number to find factorial:");
		//num=s.nextInt();
		//s.close();
		int fact=1;
		for(int i=num;i>0;i--) {// fact= n(n-1)!5(4)4(3)3(2)2(1)1(0)
			fact=fact*i;//5*1=(5*4)=(20*3)=(60*2)=120*1=120
		}
		System.out.println("Factorial of given number: "+fact);
	}

}
