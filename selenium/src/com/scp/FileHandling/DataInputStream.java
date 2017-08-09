package com.scp.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataInput;
public class DataInputStream {

	public DataInputStream(FileOutputStream fs) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException ,FileNotFoundException{
		// TODO Auto-generated method stub

		/*CreateTextFile ctf =new CreateTextFile();
		
		FileInputStream fis = new FileInputStream ("C:\\Users\\Ganesh\\Desktop\\word1.Text");
		int i = fis.read();
		System.out.println(i);
		Object oo [] =  new Object[3];
		//oo =(int) i;
		System.out.println((Object)i);
		
		FileOutputStream fos =new FileOutputStream("C:\\Users\\Ganesh\\Desktop\\word1.Text");
		//fos.write("ganesh");
		fos.write(12);
		fos.write(45);*/
		try{
		FileOutputStream fs = new FileOutputStream ("C:\\Users\\Ganesh\\Desktop\\Test.Text.txt");
		//fs.read(null);
		DataInputStream dis = new DataInputStream(fs);
		
		int i = ((DataInput) dis).readInt();
		float f =((DataInput)dis).readFloat();
		char c =((DataInput)dis).readChar();
		long l  =((DataInput)dis).readLong();
		double d =((DataInput)dis).readDouble();
		Byte b  =((DataInput)dis).readByte();
		String s =((DataInput)dis).readUTF();
		boolean dd = ((DataInput)dis).readBoolean();
		System.out.println(i);
		System.out.println(f);
		System.out.println(c);
		System.out.println(l);
		System.out.println(d);
		System.out.println(b);
		System.out.println(s);
		System.out.println(dd);}
catch(FileNotFoundException fle)
{
	System.out.println(" file not find ");
}
		finally 
		{
		//	System.out.println("close the file");
		}
	}

}
