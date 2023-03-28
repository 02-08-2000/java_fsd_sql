/**
 * 
 */
package BATCH3.Com.autowiring;

/**
 * @author Administrator
 *
 */
public class Notificationservice {
	private Messageservices messageservices;
	public void notifyservices(){
		
		messageservices.sendmessages("hello");
	}
	public void setMessageservices(Messageservices messageservices) {
		this.messageservices=messageservices;
	}
}
