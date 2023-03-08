/**
 * 
 */
package Practise;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Days {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int days =0;
int count=0;
Scanner sc=new Scanner(System.in);
while(true) {
	System.out.println("automatacally system knows");
	System.out.println("choose 1 daysnames");
	System.out.println("choose 2 count days");
	System.out.println("choose 3 exit");
	System.out.println("enter your choose:");
	int choose=sc.nextInt();
	switch(choose) {
	case 1: System.out.println("enter the days");
	       if(days!=0) {
	    	   System.out.println("1.sunday");
	    	   System.out.println("2.monday");
	       }
	break;
	case 2: if(days>0) {
		 count++;
	}
	else {
		System.out.println("not a day");
	}
	
	}
	
}
	}

}
