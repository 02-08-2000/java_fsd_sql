/**
 * 
 */
package UST_BATCHN0_3.Junit5testcase;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class Wordcounting {
	
	@Test
	public void Wordscount(){
		ArrayList<String>input1=new ArrayList(Arrays.asList("he","hi","hi"));
		String input2="hi";
		int expected=2;
		int actual=Wordcount.countWords(input1, input2);
		assertEquals(expected,actual);
	}
	}
