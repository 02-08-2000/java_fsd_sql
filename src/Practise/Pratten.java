/**
 * 
 */
package Practise;

/**
 * @author Administrator
 *
 */
public class Pratten {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int lines=8;
int i,j;
for(i=1;i<lines;i++) {
	for(j=1;i<lines/2;i++) {
		if(j==i) {
			System.out.println(j);
		}
			else if(i>4&&j==lines-i) {
				System.out.println(j);
			}
			else {
				System.out.println(" ");
			}
		
			j=j-1;
	}
	while(j>0) {
		if(j==i) {
			System.out.println(j);
		}
		else if(i>4&&j==lines-i) {
			System.out.println(j);
		}
		else {
			System.out.println(" ");
		}
	
	j=j-1;
	}
	System.out.println(" ");
	
}
	}

}
