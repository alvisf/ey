package day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class LambdaDemo {
	public static void main(String[] args) throws Exception{
		Employee emp=new Employee();//this will load the object in memory....
		emp.s=emp.s+"new changes.....";
		System.out.println(emp.p);
		ObjectOutputStream ois=new ObjectOutputStream(new FileOutputStream("emp.dat"));
		ois.writeObject(emp);//this will create a hard copy of the object in harddisk....
		//emp=null;
		Employee e=emp=(Employee)new ObjectInputStream(new FileInputStream("emp.dat")).readObject();
		System.out.println(emp.s);
		System.out.println(e.s);
		
		System.out.println(e.p);
		
	}
}
class Employee implements Serializable{
	String s="hello world...";
	transient String p="hello moon...";
	
	
