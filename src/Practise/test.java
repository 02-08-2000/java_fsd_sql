/**
 * 
 */
package Practise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Product> ProductList=new ArrayList<Product>();
           ProductList.add(new Product(12,"laee",12039));
           ProductList.add(new Product(13,"bdxw",30788));
           ProductList.add(new Product(14,"vcdkys",697));
          List<Integer> m= ProductList.stream().filter(t->t.price>697).map(p->p.price).collect(Collectors.toList());
          
          System.out.println(m);
	}
}
