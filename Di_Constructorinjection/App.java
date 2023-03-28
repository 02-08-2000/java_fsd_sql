package BATCH3.Di_Constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("aplicationContext.xml");  
    	
    	
    	Roles r1=context.getBean("roless",Roles.class);
        r1.display();
    }
}
