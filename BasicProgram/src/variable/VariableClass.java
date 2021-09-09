package variable;

public class VariableClass {
	public static void main(String[] args) {
		VariableClass v=new VariableClass();
		display1();
		v.display2();
		
	}
	public static void display1()
	{
		String Name ="Kiran";
		int K =27;
		System.out.println(Name+"\n"+K);
		
	}
	public void display2() {
		String MailId = "abc@xyz.com";
		int Y=1234;
		System.out.println(MailId+"\n"+ Y);
		
	}

}
