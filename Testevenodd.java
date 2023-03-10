/**
 * 
 */
package UST_BATCHN0_3.Junit5testcase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class Testevenodd {
	@Test
     public void testeven(){
    int number=0;
    boolean result=iseven(number);
    assertTrue(result);
     }
  @Test
  public void Testodd() {
	  int number=9;
	  boolean result=iseven(number);
	  assertFalse(result);
	  
  }
  
	
	public boolean iseven(int number)
	{
		return number%2==0;
	}
	
}
