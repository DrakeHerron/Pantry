public class NewItemOil extends  GenericItem{

	private double smokePoint;
	
	//constructor
	public NewItemOil() {
		super();
		smokePoint = 125.5;
		super.setType("oil");
	}
	
	//NewItemOil("Canola", 12, "Canola Oil");
	public NewItemOil(String itemName, double itemQty, String oilType) {
		//String itemName, double itemQty, String itemExp, double itemCapacity
		super(itemName, itemQty, "01/01/99", 10);
		super.setType("oil");
		smokePoint = 125.5;
	}
	
	public double getSmokePoint() {
		return smokePoint;
	}
	
	
	public String toString() {
		return "overriden function";
	}
}
