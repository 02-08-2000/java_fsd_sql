/**
 * 
 */
package Practise;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class NthPrime {

	/**
	 * @param args
	 * @param n 
	 */
	public static void main(String[] args, int n) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n to compute the Nth value:");
int n1=sc.nextInt();
int num=1,count=0,i;
while(count<n1) {
	num=num+1;
	for(i=2;i<=num;i++) {
		if(num%i==0) {
			break;
		}
	}
	if(i==num){
		count=count+1;
	}
}
System.out.println("the"+n1+"thprime numberis:"+num);
	}

}
