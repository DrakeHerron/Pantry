public class NewItemFlour extends GenericItem{
	private boolean gf;
	
	public NewItemFlour() {
		super();
		super.setType("flour");
	}
	
	
	//	public GenericItem(String itemName, double itemQty, String itemExp, double itemCapacity) {

	public NewItemFlour(String itemName, double itemQty, String itemExp, double itemCapacity, boolean isGF) {
		super(itemName, itemQty, itemExp, itemCapacity);
		super.setType("flour");
		
		gf = isGF;
	}
	
	public boolean isGlutenFree() {
		return gf;
	}
	

}
