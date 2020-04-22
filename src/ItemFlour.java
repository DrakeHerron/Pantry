public class ItemFlour {
	private String name;
	private double qty;
	private String exp;
	private double capacity;
	private boolean gf;
	
	public ItemFlour() {
		name = "Generic";
		qty = 0.0;
		exp = "01/01/99";
		capacity = 50.5;
		gf = false;
	}
	
	public ItemFlour(String itemname, double itemQty) {
		name = itemname;
		qty = itemQty;
		exp = "01/01/99";
		capacity = 50.5;
		gf = false;		
	}
	
	public ItemFlour(String itemname, double itemQty, boolean itemGF) {
		name = itemname;
		qty = itemQty;
		exp = "01/01/99";
		capacity = 50.5;
		gf = itemGF;		
	}
	
	//METHODS -- Actions
	public double getCapacity() {
		return capacity;
	}
	public String getName() {
		return name;
	}
	
		//visibility returnname Name(Parameters){}
		public double getQty() {
			return qty;
		}
		
		public String pour(double pourQty) {
			String r = "";
			
			if(pourQty > qty) {
				//can't pour
				r = "Not enough in the container";
			} else {
				//can pour
				qty = qty - pourQty;
				r = "Poured " + Double.toString(pourQty) + " from the container. " +
				"There is now " + Double.toString(qty) + " left in the container.";
			}
			
			return r;
		}
		
		
		public String addQty(double amt) {
			qty = amt + qty;
			double overage = qty - capacity;
			String response = "";
			if(overage > 0){
				qty = capacity;
				response = "There was " + Double.toString(overage) + " over. The container " +
				" is at capacity";
			} else {
				response = "Added " + Double.toString(amt) + 
						" to the container.";
			}
			
			return response;
		}
		
		public String toString() {
			return "Name: " + name +"\nQuantity: "+ Double.toString(qty) +
					"\nCapacity: " + Double.toString(capacity) + "\nExp: " + exp;
		}
		
}
