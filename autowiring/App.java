package BATCH3.Com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");  
    	 Notificationservice n = context.getBean(Notificationservice.class);
    	 n.notifyservices();
    }
}
