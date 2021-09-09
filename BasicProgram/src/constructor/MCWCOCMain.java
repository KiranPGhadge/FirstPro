package constructor;

public class MCWCOCMain {
	//Classname.Method name
	//Method calling from another class
	public static void main(String[] args) {
		MCWC.name();
		MCWC v=new MCWC();
		v.add();
		v.sub();
	    MCOC b=new MCOC();
	    b.mul();
	    b.div();	
	}
}
