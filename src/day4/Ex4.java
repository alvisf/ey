package day4;


public class Ex4 {
public static void main(String[] args) {
	int remainder;
	  boolean isPrime=true;
	  int num=19;
	        
	  for(int i=2;i<=num/2;i++)
	  {
	            remainder=num%i;
	            
	     if(remainder==0)
	     {
	        isPrime=false;
	        break;
	     }
	  }
	  if(isPrime)
	     System.out.println(num + " is a Prime");
	  else
	     System.out.println(num + " is not a Prime");
	    }
}

