public class ItemOil {
	//Add private, class level variables...
	//attributes
	
	private String name;
	private double qty;
	private String exp;
	private double capacity;
	
	
	//CONSTRUCTORS...
	
	//default
	public ItemOil() {
		//set predefined values
		name = "generic";
		qty = 12.0;
		exp = "12/20/20";
		capacity = 20;
	}
	
	//constructor -- different arguments
	public ItemOil(String name, double qty) {
		this.name = name;
		this.qty = qty;
		exp = "01/01/99";
		capacity = 20;
	}
	
	public ItemOil(String name, double qty, String exp) {
		this.name = name;
		this.qty = qty;
		this.exp = exp;
		capacity = 20;
	}
	
	//METHODS -- Actions
	
	//visibility returnname Name(Parameters){}
	public String getName() {
		return name;
	}
	public double getQty() {
		return qty;
	}
	
	public double getCapacity() {
		return capacity;
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
