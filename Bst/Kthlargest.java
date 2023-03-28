/**
 * 
 */
package Bst;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Kthlargest {
	public static void main(String[] args) {
	int k=4;
		List<Integer> l=new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(12);
		l.add(5);
		Optional<Integer> s=l.stream().distinct().sorted(Collections.reverseOrder()).skip(k-1).findFirst();
	System.out.println(s);
	}

}
