package day4;

import java.util.stream.IntStream;

public class Ex5 {
	static int avg;
 static int avg(int[]myArray ){
	 avg=IntStream.of(myArray).sum()/myArray.length;
	 return avg;
 }
 
 public static void main(String[] args) {
	int[] myArray = {1,3,334,45,34};
	System.out.println(avg(myArray));
}
}
