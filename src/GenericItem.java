public class GenericItem implements Container{
	
	//Similar Attributes -- name, qty, exp, capacity
	private String type;
	private String name;
	private double currentQty;
	private String exp;
	private double capacity;
	//if the pantry contains
	private boolean contains;
	//prints out if the pantry contains
	public boolean contains(){return contains; }
	
	//Constructors -- Default and set everything
	public GenericItem() {
		name = "generic";
		currentQty = 1;
		exp = "01/01/99";
		capacity = 1;
		type = "generic";

		contains = true;
	}
	
	
	public GenericItem(String itemName, double itemQty, String itemExp, double itemCapacity, boolean contains) {
		name = itemName;
		currentQty = itemQty;
		exp = itemExp;
		capacity = itemCapacity;
		type = "generic";

		this.contains = contains;
	}
	
	//Action
	public String getName() {
		return name;
	}
	
	public double getCurrentQty() {
		return currentQty;
	}
	
	public double getCapacity() {
		return capacity;
	}
	
	public String getType() {
		return type;
	}
	
	protected void setType(String t) {
		type = t;
	}
	
	public String pour(double pourQty) {
		String r = "";
		
		if(pourQty > currentQty) {
			r = "Not enough in the container";
		} else {
			currentQty = currentQty - pourQty;
			r = "Poured" + Double.toString(pourQty) + " from the container. " +
			  "There is now " + Double.toString(currentQty) +" left in the container.";
		}
		
		return r;
	}
	
	public String addQty(double amt) {
		currentQty = amt + currentQty;
		double overage = currentQty - capacity;
		String response = "";
		if(overage > 0){
			currentQty = capacity;
			response = "There was " + Double.toString(overage) + " over. The container " +
			" is at capacity";
		} else {
			response = "Added " + Double.toString(amt) + 
					" to the container.";
		}
		
		return response;
	}
	
	
	public String toString() {
		return "Name: " + name +"\nQuantity: "+ Double.toString(currentQty) +
				"\nCapacity: " + Double.toString(capacity) + "\nExp: " + exp;
	}







}
