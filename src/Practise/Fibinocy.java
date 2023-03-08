/**
 * 
 */
package Practise;

/**
 * @author Administrator
 *
 */
public class Fibinocy {
static int a=0,b=1;
static void printfibinoncy(int count) {
	if(count>0) {
		int c=a+b;
		a=b;
		b=c;
		System.out.println(" "+c);
	printfibinoncy(count-1);
}
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int count=7;
		System.out.println(a+" "+b);
		printfibinoncy(count-2);
	}

	
}

