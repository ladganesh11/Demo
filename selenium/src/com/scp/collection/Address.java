/**
 * 
 */
package com.scp.collection;

/**
 * @author Ganesh
 *
 */
public class Address {

	private String line_No;
	private String Street_Nmae;
	private String city_Nmae;
	private String country_Name;
	private long zip_Code ;
	
	@Override
	public String toString() {
		return "Address [line_No=" + line_No + ", Street_Nmae=" + Street_Nmae + ", city_Nmae=" + city_Nmae
				+ ", country_Name=" + country_Name + ", zip_Code=" + zip_Code + "]";
	}
	/**
	 * @param line_No
	 * @param street_Nmae
	 * @param city_Nmae
	 * @param country_Name
	 * @param zip_Code
	 */
	public Address(String line_No, String street_Nmae, String city_Nmae, String country_Name, long zip_Code) {
		super();
		this.line_No = line_No;
		Street_Nmae = street_Nmae;
		this.city_Nmae = city_Nmae;
		this.country_Name = country_Name;
		this.zip_Code = zip_Code;
	}
	public String getLine_No() {
		return line_No;
	}
	public void setLine_No(String line_No) {
		this.line_No = line_No;
	}
	public String getStreet_Nmae() {
		return Street_Nmae;
	}
	public void setStreet_Nmae(String street_Nmae) {
		Street_Nmae = street_Nmae;
	}
	public String getCity_Nmae() {
		return city_Nmae;
	}
	public void setCity_Nmae(String city_Nmae) {
		this.city_Nmae = city_Nmae;
	}
	public String getCountry_Name() {
		return country_Name;
	}
	public void setCountry_Name(String country_Name) {
		this.country_Name = country_Name;
	}
	public long getZip_Code() {
		return zip_Code;
	}
	public void setZip_Code(long zip_Code) {
		this.zip_Code = zip_Code;
	}

}
