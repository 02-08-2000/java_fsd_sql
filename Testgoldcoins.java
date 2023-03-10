/**
 * 
 */
package UST_BATCHN0_3.Junit5testcase;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class Testgoldcoins {
	@Test
	public void testofgoldcoins() {
	Empgoldcoins s=new Empgoldcoins();
assertEquals("*****",s.findcoins(LocalDate.of(2022,2,4)));
assertEquals("***",s.findcoins(LocalDate.of(2022,4,4)));
}
}
