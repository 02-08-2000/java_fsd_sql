/**
 * 
 */
package BATCH3.Di_Constructorinjection;

/**
 * @author Administrator
 *
 */
public class Roles {
	 public String charactername;
	 public String responsibility;
	 
	 
	


	public Roles(String charactername, String responsibility) {
		
		this.charactername = charactername;
		this.responsibility = responsibility;
	}


	@Override
	public String toString() {
		return "Roles [charactername=" + charactername + ", responsibility=" + responsibility + "]";
	}


	public void display() {
		  System.out.println("my name is "+charactername+"my responsibility is"+responsibility);
	  }
}
