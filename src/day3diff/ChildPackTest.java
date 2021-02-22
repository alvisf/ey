package day3diff;

import day3.Test;

public class ChildPackTest extends Test{
	
		public void childMet() {
		Test test= new Test();
		
		System.out.println(test.pri);
	}
	
}
class NonChildDifPack {
	public void childMet() {
		Test test= new Test();
		System.out.println(test.pri);
	}
}