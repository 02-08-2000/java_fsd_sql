/**
 * 
 */
package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Administrator
 *
 */
public class Frequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> m= Arrays.asList("hueed","hueed","ndwhdnx");
		Map<String,Long> names= m.stream().map(city->city.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(names);
	}

}
