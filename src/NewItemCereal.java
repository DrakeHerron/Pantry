public class NewItemCereal extends GenericItem {
	private String brand;
	private double sugarContent;
	private String tastiness;
	private boolean prize;
	
	
	//Default Constructor
	public NewItemCereal(){
		super();
		super.setType("cereal");
		brand = "";
		sugarContent = 0;
		tastiness = "Bland";
		prize = false;
	}
	
	public NewItemCereal(String theBrand, double sugar, String taste, boolean thePrize) {
		super();
		super.setType("cereal");
		brand = theBrand;
		sugarContent = sugar;
		tastiness = taste;
		prize = thePrize;
	}
	
	public NewItemCereal(String itemName, double itemQty, String itemExp, double itemCapacity,String theBrand, double sugar, String taste, boolean thePrize ) {
		super(itemName, itemQty, itemExp, itemCapacity);
		super.setType("cereal");
		brand = theBrand;
		sugarContent = sugar;
		tastiness = taste;
		prize = thePrize;
	}
	
	/*
	 * getBrand( ) -> String
	getSugarContent( ) -> Double
	getTastiness( ) -> String
	hasPrize( ) -> boolean
	 */
	 
	 
	 public String getBrand() {
		 return brand;
	 }
	 
	 public double getSugarContent() {
		 return sugarContent;
	 }
	 
	 public String getTastiness() {
		 return tastiness;
	 }
	 
	 public boolean hasPrize() {
		 return prize;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
