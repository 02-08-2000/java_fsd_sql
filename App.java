package UST_BATCHN0_3.Junit5testcase;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a value:");
        int n=sc.nextInt();
        if(n%2==0) {
        	System.out.println("even number");
        }
        	else 
        	{
        		System.out.println("odd number");
        	}
        
    }
}
