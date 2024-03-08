package Day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable{
	int i;
}
public class SerializationExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student1 s=new Student1();
		s.i=4;
		//write data into file- store object
		File f=new File("leg.txt");
		FileOutputStream fos= new FileOutputStream(f);
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(s);
		//oos.close();
		//fos.close();
		FileInputStream ios= new FileInputStream(f);
		ObjectInputStream sss= new ObjectInputStream(ios);
		Student1 s1= (Student1) sss.readObject();
		System.out.println(s1.i);
		
		

	}

}
