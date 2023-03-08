/**
 * 
 */
package Practise;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Count {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int count=0;
    System.out.println("enter the number:");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    while(num!=0) {
    	num=num/10;
    	count ++;
    }
    System.out.println("the digits is:"+count);
	}

}
