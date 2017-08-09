/**
 * 
 */
package com.scp.collection;

/**
 * @author Ganesh
 *
 */
public class Stud {

	/**
	 * ress
	 */
	private int id ;
	private String Name;
	//private Address Adsress;
	private float sscPercentage;
	@Override
	public String toString() {
		return "Stud [id=" + id + ", Name=" + Name + ", sscPercentage=" + sscPercentage + ", Adsress=" + Adsress + "]";
	}

	/**
	 * @param id
	 * @param name
	 * @param sscPercentage
	 * @param adsress
	 */
	public Stud(int id, String name, float sscPercentage, Address adsress) {
		super();
		this.id = id;
		Name = name;
		this.sscPercentage = sscPercentage;
		Adsress = adsress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public float getSscPercentage() {
		return sscPercentage;
	}

	public void setSscPercentage(float sscPercentage) {
		this.sscPercentage = sscPercentage;
	}

	public Address getAdsress() {
		return Adsress;
	}

	public void setAdsress(Address adsress) {
		Adsress = adsress;
	}

	private Address Adsress;
	
	

}

