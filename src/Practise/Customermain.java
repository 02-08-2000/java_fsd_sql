/**
 * 
 */
package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Customermain{
/**
 * @author Administrator
 *
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> c=new ArrayList<>();
        c.add(new Customer("1223","fghujv","2476788899","uhwuxhu@12","dcfg"));
        c.add(new Customer("1224","fghu","2476788823","uhwuxhu@24","dc"));
        c.add(new Customer("1225","fjv","2476788867","uhwuxhu@34","fg"));
     
        System.out.println(c);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Customer id:");
          String lookid=sc.nextLine();
		List<Customer> c1=c.stream().filter(t->t.getRegid().equals(lookid)).collect(Collectors.toList());
			if(c1.isEmpty())
			{
				System.out.println("no result is found");
			}
			else {
				System.out.println(c1);
			}
		
	}   
	}


