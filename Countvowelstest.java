/**
 * 
 */
package UST_BATCHN0_3.Junit5testcase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class Countvowelstest {
@Test
public void counttesting() {
String s="meghana welcome";
int excepeted=6;
int actual=Countvowels.vowelscount(s);
assertEquals(excepeted,actual);
}
}
