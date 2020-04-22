import java.util.ArrayList;

public class ShelfFlour {
	//Attributes
	double volume;
	double currentVolume;
	ArrayList<ItemFlour> flourShelf;
	
	//default constructor
	public ShelfFlour() {
		flourShelf = new ArrayList<ItemFlour>();
		currentVolume = 0;
		volume = 0;
	}
 	
	public ShelfFlour(double maxVolume) {
		flourShelf = new ArrayList<ItemFlour>();
		currentVolume = 0;
		volume = maxVolume;
	}
	
	public ShelfFlour(ArrayList<ItemFlour> shelf) {
		flourShelf = shelf;
	}
	
	
	//Actions -- Methods
	
	//Put Items on the Shelf
	public boolean place(ItemFlour item) {
		if(currentVolume + item.getCapacity() <= volume) {
			currentVolume = currentVolume  + item.getCapacity();
			flourShelf.add(item);
			return true;
		} else {
			return false;
		}
	}
	
	//Get the Item from the shelf
	public ItemFlour remove(String name) {
		ItemFlour returnItem = null;
		
		for(int i = 0; i < flourShelf.size(); i++) {
			ItemFlour item = flourShelf.get(i);
			String itemName = item.getName();
			if(itemName.equals(name)) {
				return flourShelf.remove(i);
			}
		}
		
		return returnItem;
	}
	
	public String toString() {
		return flourShelf.toString();
	}
}
