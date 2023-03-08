/**
 * 
 */
package Practise;

import java.util.Arrays;

/**
 * @author Administrator
 *
 */
public class Arraysort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
String[] Array=new String[] {"gd","gsh","yg","zg","le"};
Arrays.sort(Array);
System.out.println("sort the string in alphabet wise");
for(int i=0;i<Array.length;i++) {
	System.out.println(Array[i]);
	
}
	}

}