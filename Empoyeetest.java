/**
 * 
 */
package BATCH3.TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Administrator
 *
 */
public class Empoyeetest {
	@Test
	public void testforemployee() {
		Employee e= new Employee("meghana",22,"fs");
		Assert.assertEquals(e.getName(),"meghana");
	}

}
