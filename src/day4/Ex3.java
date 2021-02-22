package day4;


public class Ex3 {
	static boolean val1=true;  //init on creation 
	   static int val2;   
	   static float val3;
	   static String val4;
	   static long val5;
	   static double val6;
	   {
	   val5=323;
	   }
	   
	   public Ex3(double val6, String val4) {
		   this.val6=val6;
		   this.val4=val4;
	   }
	   
	   public static void main(String[] args) {
	      val2=1;   //init after creation
	      Ex3 obj = new Ex3(1.2,"Hello World");
	    		  
	     val3=val2;
	      val4=String.valueOf(val5);
	      
	      System.out.println("Val1 = " + val1);
	      System.out.println("Val2 = " + val2);
	      System.out.println("Val3 = " + val3);
	      System.out.println("Val4 = " + val4);
	      System.out.println("Val5 = " + val5);
	      System.out.println("Val6 = " + val6);
	      
	      
	         }
}
