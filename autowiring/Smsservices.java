package BATCH3.Com.autowiring;

public class Smsservices implements Messageservices {

	public void sendmessages(String msg) {
		System.out.println("i am from smsservices"+msg);
		
		
	}

}
