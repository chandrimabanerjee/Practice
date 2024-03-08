package Day2;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataInputStream;


public class FileHandeling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//write data into a file
		File f=new File("leg.txt");// this will be created in project location
		FileOutputStream fos= new FileOutputStream(f);
		DataOutputStream dos= new DataOutputStream(fos);
	    dos.writeUTF("This is new");
	    
	    FileInputStream ios= new FileInputStream(f);
		DataInputStream os= new DataInputStream(ios);
	   String Name= os.readUTF();
	   System.out.println(Name);
	}

}
