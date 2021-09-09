package constructor;

import java.util.Scanner;

public class UserInput {
  public void My_Info() {
	  Scanner t =new Scanner(System.in);
	  System.out.println("Enter  Your First Name");
	  String Fn=t.nextLine();
	  System.out.println("Enter  Your Middle Name");
	  String Mn=t.nextLine();
	  System.out.println("Enter  Your Last Name");
	  String Ln=t.nextLine();
	  System.out.println("Enter  Your Mobile Number");
	  String MN=t.nextLine();
	  System.out.println("Enter  Your Blood Group");
	  String BG=t.nextLine();
	  System.out.println("Enter  Your Email Id");
	  String Eid=t.nextLine();
	  t.close();
	  System.out.println("Full Name:"+Fn+" "+Mn+" "+Ln+"\n"+"Mobile NO:"+MN+"\n"+"Blood Group:"+BG+"\n"+"Email id :"+Eid);
 }
public static void main(String[]args) {
	UserInput u=new UserInput();
	u.My_Info();
}
}
