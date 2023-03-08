/**
 * 
 */
package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class Words {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1="welcome to my world";
		String[] s1ToWord= s1.split("[ ,:;.?]");
		List<String> thewords=Arrays.stream(s1ToWord).filter(t->!t.isEmpty()).collect(Collectors.toList());
		List<String> uniqueword=thewords.stream().map(t->t.toLowerCase()).distinct().sorted().collect(Collectors.toList());
		System.out.println("number of words:" +thewords.size());
		
		
		System.out.println("unique words:" +uniqueword.size());
		System.out.println(uniqueword);
		
	}

	
}
