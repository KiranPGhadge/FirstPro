package controlStatement;

public class ElseIfElse {
	public void  c1(){
	     int marks=85;
	     if(marks>90) {
	    	 System.out.println("A+ Grade class");
	     }
	     else if(marks>=40&&marks<=50){
	    	 System.out.println("pass"); 
	     }
	     else if(marks>=50&&marks<=60){
	    	 System.out.println("Third class"); 
	     }
	     else if(marks>=60&&marks<=70){
	    	 System.out.println("second class"); 
	     }
	     else if(marks>=70&&marks<=80){
	    	 System.out.println("First class"); 
	     }
	     else if(marks>=80&&marks<=90){
	    	 System.out.println("A Grade class"); 
	     }

	     else {
	    	 System.out.println("Fail");
	     }
	}
	public static void main(String[]args) {
		ElseIfElse h=new ElseIfElse();
		h.c1();
		
	}
     
}
