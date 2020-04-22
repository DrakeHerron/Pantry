import java.util.ArrayList;

public class ShelfOil {
	//Attributes
	private ArrayList<ItemOil> shelf;
	private double volume;
	private double currentVolume;
	
	//Constructors
	public ShelfOil() {
		shelf = new ArrayList<ItemOil>();
		volume = 100;
		currentVolume = 0;
	}
	
	public ShelfOil(double shelfVolume) {
		shelf = new ArrayList<ItemOil>();
		volume = shelfVolume;
		currentVolume = 0;
	}
	
	
	
	
	//Methods
	public ItemOil remove(String itemName) {
		//
		ItemOil returnVal = null;
		//System.out.println(shelf.toString());
		for(int i = 0; i < shelf.size(); i++) {
			ItemOil itemOnShelf = shelf.get(i);
			String nameOfItem = itemOnShelf.getName();
			if(nameOfItem.equals(itemName)) {
				returnVal = shelf.remove(i);
				return returnVal;
			}
		}
		return returnVal;
	}
	
	public boolean place(ItemOil item) {
		
		if(currentVolume + item.getCapacity() <= volume ) {
			currentVolume = currentVolume + item.getCapacity();
			shelf.add(item);
			return true;
		} else {
			return false;
		}
	}
	
	public double remainingCapactity() {
		return volume = currentVolume;
	}
	
	public String toString() {
		return shelf.toString();
	}
	

}
