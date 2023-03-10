/**
 * 
 */
package UST_BATCHN0_3.Junit5testcase;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class GarementSalesAnalyzerTest {
@Test
public void testGarementSalesAnalyzer(){
	List<GarmentProducts>  garments=new ArrayList<>();
	garments.add(new GarmentProducts("t-Shirt", 10, 500, LocalDate.of(2023, 3, 10)));
    garments.add(new GarmentProducts("Pants", 5, 200, LocalDate.of(2023, 3, 10)));
    garments.add(new GarmentProducts("Shirt", 5, 250, LocalDate.of(2023, 3, 9)));
    garments.add(new GarmentProducts("Shirts", 5, 500, LocalDate.of(2023, 3, 10)));
	GarmentSaleAnalyzer analyzer = new GarmentSaleAnalyzer(garments);
	
	 Map<String, Double> result = analyzer.analyzer(LocalDate.of(2023, 3, 10));
	 assertEquals(2500, result.get("Shirts"), 0);
}


}
