package com.scp.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@SuppressWarnings("unused")
public class WriteFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream sss = new FileOutputStream("C:\\Users\\Ganesh\\Desktop\\Test.txt");
		sss.write(4);

		sss.write('s'+'g');
	//	sss.write("dssdds");
		sss.write(12);
		sss.write(12552233);
		sss.write(1212122121);
		System.out.println("any where");
	}

}
