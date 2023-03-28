package BATCH3.Di_setterinjection;

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
    	ApplicationContext context =new ClassPathXmlApplicationContext("aplicationContext.xml");  
    	Roles r=context.getBean("Roles",Roles.class);
        r.display();
        Roles r1=context.getBean("Roles1",Roles.class);
        r1.display();
    }
}
