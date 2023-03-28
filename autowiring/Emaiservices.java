package BATCH3.Com.autowiring;

public class Emaiservices implements Messageservices {

	public void sendmessages(String msg) {
		System.out.println("i am from emailservices"+msg);
		
	}

}
