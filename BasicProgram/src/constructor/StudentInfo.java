package constructor;

public class StudentInfo {
	String name;
	String id;
	int age;
	String dob;
	public StudentInfo() {
		System.out.println("Zero Argument Constructor");
		name="Kiran ";
		id=" K123 ";
		age= 26 ;
		dob=" 27/02/94";
		System.out.println(name+id+age+dob);
	}
	public StudentInfo(String name1,String id1,int age1,String dob1) {
		System.out.println("Argument Constructor");
		name=name1;
		id=id1;
		age=age1;
		dob=dob1;
		System.out.println(name+id+age+dob);
	}
	public static void main(String[]args) {
		new StudentInfo();
		new StudentInfo("Jyoti "," j235 ", 27," 12/06/93");
	}
	

}
