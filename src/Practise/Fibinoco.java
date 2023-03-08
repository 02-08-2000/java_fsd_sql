/**
 * 
 */
package Practise;

/**
 * @author Administrator
 *
 */
public class Fibinoco {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int count=3;
		int i;
		System.out.println(a+" "+b);
		for(i=0;i<count;i++) {
			int c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}
}