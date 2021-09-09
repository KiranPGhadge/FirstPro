package blocksinjava;

public class Block {
	static {
		String name="Kiran";
		System.out.println("Firstname:"+name);
	}
	{
		String name1="Ghadge";
		System.out.println("Lastname:"+name1);
	}
	{
		String place="Sangli";
		System.out.println("Native Place:"+place);	
	}
    public static void name1() {
    	String name="Pratap";
		System.out.println("Middlename:"+name);
    }
    public Block() {
    	int a=123456789;
		System.out.println("MobileNo:"+a);
    }
    public void mob() {
    	int a=123456789;
		System.out.println("Alternate MobileNo:"+a);
    }
  public static void main(String[]args) {
    	name1();
    	Block k=new Block();
    	k.mob();
    }
}
