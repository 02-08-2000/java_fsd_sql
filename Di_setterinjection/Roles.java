/**
 * 
 */
package BATCH3.Di_setterinjection;

/**
 * @author Administrator
 *
 */
public class Roles {
  public String charactername;
  public String responsibility;
public String getCharactername() {
	return charactername;
}
public void setCharactername(String charactername) {
	this.charactername = charactername;
}
public String getResponsibility() {
	return responsibility;
}
public void setResponsibility(String responsibility) {
	this.responsibility = responsibility;
}
  public void display() {
	  System.out.println("my name is "+charactername+"my responsibility is"+responsibility);
  }
}
