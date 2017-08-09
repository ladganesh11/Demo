package com.scp.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fi = new File("C:\\Users\\Ganesh\\Desktop\\word1.Text");
		//System.out.println(fi.exists());

		boolean b = fi.mkdir();
		
		System.out.println(b);
		fi.createNewFile();
		System.out.println(fi.exists());
		
		//DeleteFile dl = new DeleteFile();
		//dl.delete("C:\\Users\\Ganesh\\Desktop\\wordyy.Text");
	}

}
class DeleteFile extends CreateTextFile
{
	public void delete ( String path ) throws IOException
	{
		
		File fi = new File("C:\\Users\\Ganesh\\Desktop\\wordyy.Text");
		//System.out.println(fi.exists());

		boolean b = fi.mkdir();
		
		System.out.println(b);
		fi.createNewFile();
		fi.delete();
		System.out.println(fi.exists());

		

	}
	
}