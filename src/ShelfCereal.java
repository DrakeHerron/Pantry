import java.util.ArrayList;

public class ShelfCereal {
	private ArrayList<ItemCereal> shelf;
	private double currentVolume;
	private double volume;
	
	public ShelfCereal() {
		volume = 100;
		init();
	}
	
	public ShelfCereal(double maxVolume) {
		init();
		volume = maxVolume;
	}
	
	
	public void init() {
		shelf = new ArrayList<ItemCereal>();
		currentVolume = 0;
	}

	public boolean place(ItemCereal item) {
		if(currentVolume + item.getCapacity() <= volume) {
			shelf.add(item);
			currentVolume = currentVolume + item.getCapacity();
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public ItemCereal remove(String product) {
		ItemCereal r = null;
		
		for(int i = 0; i < shelf.size(); i++) {
			if(shelf.get(i).getName().equals(product)) {
				return shelf.remove(i);
						
			}
		}
		
		return r;		
	}
}
