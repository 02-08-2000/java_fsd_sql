/**
 * 
 */
package UST_BATCHN0_3.Junit5testcase;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class GarmentSaleAnalyzer {
       public final List<GarmentProducts> garments;
       public GarmentSaleAnalyzer(List<GarmentProducts> garments) {
    	   this.garments=garments;
       }
       public Map<String, Double>analyzer(LocalDate selecteddate){
    	   List<GarmentProducts> selectedGarments= garments.stream().
    			filter(g->g.getSaleDate().equals(selecteddate)).collect(Collectors.toList());
    			
    	   Map<String, Double> garmentSales=new HashMap<>();
    	   for(GarmentProducts garment:selectedGarments) {
    		   double TotalSaleAmount=garment.getTotalSaleAmount();
    		   if(garmentSales.containsKey(garment.getName())) {
    			   TotalSaleAmount += garmentSales.get(garment.getName());
    		   }
    		   garmentSales.put(garment.getName(), TotalSaleAmount);
    	   }
		
		return garmentSales;
    	   
       }
}
