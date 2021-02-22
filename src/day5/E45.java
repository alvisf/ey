package day5;

public class E45 {
	public static void main(String argv[]){   
		Ref r = new Ref();     
		r.amethod(r);         
		}          
	public void amethod(Ref r){  
		int i=99;        
		multi(r);        
  System.out.println(i);       
  }       
	public void multi(Ref r){  
		r.i = r.i*2;     
		} 
}
