package variable;

public class PrimitiveDatatype {
	public static void main(String[] args) {
		PrimitiveDatatype v=new PrimitiveDatatype();
		v.type1();
		type2();
	}
    public void type1() {
    	boolean m=true;
    	boolean b=false;
    	System.out.println("True value of boolean="+m);
    	System.out.println("False value of boolean="+b);
    	
    	byte c=-128;
    	byte e=127;
    	System.out.println("Min value of byte="+c);
    	System.out.println("Max value of byte="+e);
    	
    	char d='K';
    	System.out.println("value of char="+d);
    }
    public static void type2() {
    	
    	short e=-32768;
    	short f=32767;
    	System.out.println(" Min value of short= "+ e);
    	System.out.println("Max value of short=  "+ f);
    	
    	int a=-2147483648;
    	int b= 2147483647;
    	System.out.println("Min value of int= "+a);
    	System.out.println("Max value of int= "+b);
    	
        float g=214566f;
        System.out.println("Value of float="+g);
        
    	long d=374849847709480l;
    	System.out.println("value of long ="+d);
    	
    	double s=8718296774849094040d;
    	System.out.println("value of double= "+s);
    	
    	
    }
}
