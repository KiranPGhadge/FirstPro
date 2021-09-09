package controlStatement;

public class NestedIfElse1 {
	public void gas(){
		String BC="Bharat Gas";
		String BN="12345";
		if(BC=="Bharat Gas") {
			if(BN=="123457") {
				System.out.println(" Booked Successfully");
			}
			else {
				System.out.println("Wrong Booking Number");
			}
		}
		else {
			System.out.println("Wrong Booking Company");
		}
	}
	public static void main(String[]args) {
		NestedIfElse1 u=new NestedIfElse1 ();
		u.gas();
		
	}

}
