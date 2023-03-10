/**
 * 
 */
package UST_BATCHN0_3.Junit5testcase;

/**
 * @author Administrator
 *
 */
public class Employeetests {
	
	public static void main(String args[]) {
		
	}
     public static int countingcoins(int n) {
    
    	 if(n<=80 && n>=1) {
    		 return 5;
    	 }
    	 else if(n>=81 && n<=172) {
    		 return 3;
    	 }
    	 else if(n>=173 && n<=266) {
    		 return 1;
    	 }
    	 else {
 
		   return 0;
    	 }
     }
}
