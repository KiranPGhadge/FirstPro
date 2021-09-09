package homework;

public class Armstrong4 {
	public static void main(String[]args) {
		 int n=9474;
   	  int temp=n;
   	  int d=0;
   	  int k=0;
   	  int s=0;
   	  while(n>0) {
   		  k=n%100;
   		  d=k%10;
   		  s=d*d*d*d+s;
   		  n=n/10;
   		 
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
