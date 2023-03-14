/**
 * 
 */
package BATCH3.TESTNG;

/**
 * @author Administrator
 *
 */
public class Salesdetails extends Customer{
      
	private double price_with_materials;
      private double price_without_materials;
	private int sqft;
	public Salesdetails(String name, String city, int no, double price_with_materials, double price_without_materials,
			int sqft) {
		super(name, city, no);
		this.price_with_materials = price_with_materials;
		this.price_without_materials = price_without_materials;
		this.sqft = sqft;
	}
	

}
