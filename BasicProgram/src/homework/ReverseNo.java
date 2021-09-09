package homework;

public class ReverseNo {
	public static void main(String[]args) {
		int num=12345;
		int rev=0;
		int c=0;
		while(num>0) {
			c=num%10;//12345%10=5 //1234%10=4// //3 //2 //1
			rev=rev*10+c;//5 //5*10+4=54//54*10+3=543//543*10+2=5432//5432*10+1=54321
			num=num/10;//12345/10=1234 //1234/10=123// 123/10=12// 12/10=1
		}
		System.out.println("Reverse No:"+rev);
	}

}
