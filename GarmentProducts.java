package UST_BATCHN0_3.Junit5testcase;

import java.time.LocalDate;

public class GarmentProducts {

	    private final String name;
	    private final int saleCount;
	    private final double price;
	    private final LocalDate saleDate;
		public GarmentProducts(String name, int saleCount, double price, LocalDate saleDate) {
			super();
			this.name = name;
			this.saleCount = saleCount;
			this.price = price;
			this.saleDate = saleDate;
		}
		public String getName() {
			return name;
		}
		public int getSaleCount() {
			return saleCount;
		}
		public double getPrice() {
			return price;
		}
		public LocalDate getSaleDate() {
			return saleDate;
		}
		public double getTotalSaleAmount() {
			return saleCount*price;
		}

	   
	}

