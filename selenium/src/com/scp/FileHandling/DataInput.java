package com.scp.FileHandling;
import java.io.DataInputStream;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInput {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Ganesh\\Desktop\\Test.txt");
		@SuppressWarnings("resource")
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(96);
		dos.writeShort(2122);
		dos.writeDouble(2222.232D);
		dos.writeFloat(525.56f);
		dos.writeUTF("heloo where are you ");
	
		FileInputStream fis = new FileInputStream("C:\\Users\\Ganesh\\Desktop\\Test.txt");
		@SuppressWarnings({ "unused", "resource" })
		DataInputStream dis = new DataInputStream(fis);
		@SuppressWarnings("unused")
		String i = dis.readUTF();
		@SuppressWarnings("unused")
		int i1 = dis.readInt();
		@SuppressWarnings("unused")
		float f = dis.readFloat();
		@SuppressWarnings("unused")
		double d = dis.readDouble();
		short ss = dis.readShort();
		System.out.println(i);
		System.out.println(i1);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ss);

	}

}
