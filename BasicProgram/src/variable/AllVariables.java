package variable;

public class AllVariables {
	int a=10;
	int b=20;
	static int c=30;
	static int d=40;
	
	  public static void main(String[]args) {

		AllVariables j=new AllVariables();
		type2();
		j.type1();
		j.type3();
		System.out.println("addtion="+(c+d));
		System.out.println(j.a+j.b);
		char a='A';
		char b='B';
		System.out.println(a+"\n"+b);
		}
	
    public void type1(){
    	System.out.println("Value of add="+(a+b));
    	System.out.println("Value of mul="+(c*d));
    }
    public static void type2(){
    	System.out.println("Value of sub="+(c-d));	
    }
    public void type3(){
    	int a=2;
    	int b=3;
    	System.out.println("Value of mul="+(a*b));
   }

}
