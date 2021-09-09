package controlStatement;

public class Switch2 {
	public void swt1() {
		String time ="5 am";
    	switch(time) {
    	case "1 am":System.out.println("Moring");break;
    	case "2 pm":System.out.println("Afternoon");break;
    	case "3 pm":System.out.println("Evening");break;
    	case "9 pm":System.out.println("Night");break;
    	case "5 am":System.out.println("Morning");break;
    	case "6 pm":System.out.println("Evening");break;
    	
    	default:System.out.println("Wrong Input");break;
	}
	}
	 public static void main(String[]args) {
     	Switch2 j=new Switch2();
     	j.swt1();
     }
}
