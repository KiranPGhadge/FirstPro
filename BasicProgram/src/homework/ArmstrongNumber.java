package homework;

public class ArmstrongNumber {
      public static void main(String[]args) {
    	  int n=153;
    	  int temp=n;
    	 
    	  int k=0;
    	  int s=0;
    	  while(n>0) {
    		  k=n%10;//153%10=3//15%10=5//1%10
    		  n=n/10;//153/10=15 //1//0
    		  s=k*k*k+s;//3*3*3+0=27 //27+5^3=152 //152+1^3=153
    		 
    		 // System.out.println(s);
    	  }
    	  if(temp==s) {
    		  System.out.println("Armstrong Number");
    	  }
    	  else {
    		  System.out.println("Not Armstrong Number");
    	  }
      }
}
