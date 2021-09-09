package constructor;

import java.util.Scanner;

public class UserInput1 {
	public void mine() {
		int num1;
		int num2;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your First Number");
		num1=s.nextInt();
		System.out.println("Enter your second Number");
		num2=s.nextInt();
		s.close();
		if(num1>num2) {
			System.out.println("1st Number is greater than 2nd Number");
		}
		if(num1==num2) {
			System.out.println("Both are euqual Numbers");
		}
		if(num1<num2)
		{
			System.out.println("2nd Number is greater than 1st Number");
		}
		 
	}
	public static void main(String[]args) {
		UserInput1 n=new UserInput1();
		n.mine();
	}

}
