/**
 * 
 */
package Practise;

/**
 * @author Administrator
 *
 */
public class Customer {
	String regid;
	String name;
	String mobileno;
	String emailid;
	String Location;
	public Customer(String regid, String name, String mobileno, String emailid, String location) {
		super();
		this.regid = regid;
		this.name = name;
		this.mobileno = mobileno;
		this.emailid = emailid;
		Location = location;
	}
	public String getRegid() {
		return regid;
	}
	public void setRegid(String regid) {
		this.regid = regid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	

}
