/**
 * 
 */
package Practise;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class vowels {
	public static void main(String[] args) {
		int count=0;
		System.out.println("enetre the sentence:");
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		for(int i=0;i<sentence.length();i++) {
			char ch=sentence.charAt(i);
			if(ch == 'a'||ch == 'e'||ch== 'i'||ch == 'o'||ch == 'u') {
				count++;
			}
			System.out.println("number of vowels in the given sentence is:"+count);
		}
	}

}
