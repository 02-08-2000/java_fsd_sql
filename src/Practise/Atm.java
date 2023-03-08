/**
 * 
 */
package Practise;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Atm {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
int balance=2000,withdraw,deposite;
Scanner sc=new Scanner(System.in);
while(true)
{
	System.out.println("automated tell machine");
	System.out.println("choose 1 withdraw");
	System.out.println("choise 2 deposite");
	System.out.println("choise 3 checkbalance");
	System.out.println("enetr your choose");
	int choose=sc.nextInt();
	switch(choose) {
	case 1: System.out.println("enetr money to withdraw:");
	withdraw=sc.nextInt();
	if(balance>=withdraw) {
		balance=balance-withdraw;
		System.out.println("withdraw successfully");
	}
	else {
		System.out.println("insufficent balance");
	}
	System.out.println(" ");
	break;
	case 2: System.out.println("enetr money to deposite:");
	deposite=sc.nextInt();
	balance=balance+deposite;
	System.out.println("deposite is successfully");
	break;
	case 3: System.out.println("balance:"+balance);
	break;
	case 4:System.exit(0);
	}
}
	}

}
