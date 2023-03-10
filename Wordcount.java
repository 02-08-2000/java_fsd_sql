/**
 * 
 */
package UST_BATCHN0_3.Junit5testcase;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Administrator
 *
 */
public class Wordcount {
	public static void main(String[] args) {
		ArrayList<String>s=new ArrayList<>(Arrays.asList("hi","hello","hi","hi","he"));
		Wordcount w=new Wordcount();
		String s1="hi";
		System.out.println(countWords(s,s1));
	}
public static int countWords(ArrayList<String>s ,String s1) {
	int count=0;
	String[] s3=s.toArray(new String[0]);
	for(int i=0;i<s3.length;i++) {
		String s2=s3[i];
		if(s2.equals(s1)) {
			count++;
		}
	}
	return count;
	
	
	}

}
