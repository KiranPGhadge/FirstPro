package constructor;

import java.util.Scanner;

public class UserInput2 {
 
		 UserInput2(int a,int b,int c,int d) { //using constructor
			if (a<b && a<c && a<d) {
				System.out.println("A is Smallest number ");
				}
			if (b<a && b<c && b<d) {
				System.out.println("B is Smallest number ");
				}
			if (c<a && c<b && c<d) {
				System.out.println("C is Smallest number ");
				}
			else {
				System.out.println("D is Smallest number ");
				}
		}
	
		public static void main(String[]args) {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter First Number");
			int num1=input.nextInt();
			System.out.println("Enter Second Number");
			int num2=input.nextInt();
			System.out.println("Enter third Number");
			int num3=input.nextInt();
			System.out.println("Enter Fourth Number");
			int num4=input.nextInt();
			input.close();
		    new UserInput2(num1,num2,num3,num4);
		}

}
