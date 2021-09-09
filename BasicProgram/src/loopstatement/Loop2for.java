package loopstatement;

public class Loop2for {
	public void type2() {
		for(int i=15;i<=30;i++) {
			System.out.println(i);
		}
		for(int i=15;i<=30;++i) {
			System.out.println(i);
		}
	}
	public static void main(String[]args) {
		Loop2for u=new Loop2for();
		u.type2();
		
	}

}
