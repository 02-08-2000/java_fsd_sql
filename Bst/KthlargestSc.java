/**
 * 
 */
package Bst;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;    //smallest element to remove the .sorted()//

/**
 * @author Administrator
 *
 */
public class KthlargestSc {
	public static void main(String[] args) {       
		Scanner scanner = new Scanner(System.in);        
		System.out.print("Enter the number of elements in the linked list: "); 
		int n = scanner.nextInt();       
		System.out.print("Enter the elements of the linked list separated by spaces: ");     
		List<Integer> linkedList = new LinkedList<>(); 
		for (int i = 0; i < n; i++) { 
			linkedList.add(scanner.nextInt());       
			}    
		System.out.print("Enter the value of k: ");    
		int k = scanner.nextInt();     
		Optional<Integer> kthLargest = linkedList.stream().distinct().sorted(Collections.reverseOrder()).skip(k - 1).findFirst();  
 if(kthLargest.isPresent()) {          
	 System.out.println("The " + k + "th largest element in the linked list is " + kthLargest.get());        
	 }
 else { 
	 System.out.println("There is no " + k + "th largest element in the linked list.");
		}
	}

}
