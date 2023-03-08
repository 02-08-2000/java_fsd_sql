/**
 * 
 */
package Practise;

/**
 * @author Administrator
 *
 */
public class Arraysortl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
String[]s=new String[]{"ab","FG","UB","YG","hg","sw","sb","FU"};
  System.out.println("sorting the elements");
  for(int i=0;i<s.length;i++) {
	  for(int j=i+1;j<s.length;j++) {
		  int temp=0;
		  if(s[i]>s[j]) {
			  temp=s[i];
			  s[i]=s[j];
			  s[j]=temp;
		  }
	  }
	  System.out.println(s[i]);
  }
	}

}
