/**
 * 
 */
package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class Square {

	/** power
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> name=Arrays.asList("Tehs","jxjw","Tywa","tbxsua");
	
List<String> n=name.stream().filter(s->s.toUpperCase().startsWith("T")).collect(Collectors.toList());
System.out.println(n);
	}

}
