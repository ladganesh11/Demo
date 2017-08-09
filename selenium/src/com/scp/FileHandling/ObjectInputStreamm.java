package com.scp.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutputStream;

public class ObjectInputStreamm {

	
	private long Acc_No;
	private String User_Name;
	private String Password ;
	private double balance ;
	public void ObjectInputStream(FileInputStream fileInputStream) {
		// TODO Auto-generated constructor stub
	}
	public long getAcc_No() {
		return Acc_No;
	}
	public void setAcc_No(long acc_No) {
		Acc_No = acc_No;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		ObjectInputStreamm obs =new ObjectInputStreamm();
		obs.setAcc_No(125455555);
		obs.setBalance(1452.256);
		obs.setPassword("godbless123");
		obs.setUser_Name("savtom");
		ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream ("C:\\Users\\Ganesh\\Desktop\\res.txt"));
			oos.writeObject(obs);
		//	ObjectInput o =new ObjectInput(new FileInputStream ("C:\\Users\\Ganesh\\Desktop\\res.txt"));

			//ObjectInput o1 =(ObjectInput) o.readObject();


	}

}
