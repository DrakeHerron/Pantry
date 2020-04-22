import java.util.ArrayList;

public class Shelf {
	private ArrayList<GenericItem> shelf;
	private double currentVolume;
	private double volume;
	
	public Shelf() {
		volume = 100;
		shelf = new ArrayList<GenericItem>();
		currentVolume = 0;
	}
	
	public Shelf(double maxVolume) {
		volume = maxVolume;
		shelf = new ArrayList<GenericItem>();
		currentVolume = 0;
	}
	
	public boolean place(GenericItem item) {
		if(currentVolume + item.getCapacity() <= volume) {
			shelf.add(item);
			currentVolume = currentVolume + item.getCapacity();
			return true;
		} else {
			return false;
		}
	}
	
	public GenericItem remove(String product) {
		GenericItem r = null;
		
		for(int i = 0; i < shelf.size(); i++) {
			if(shelf.get(i).getName().equals(product)) {
				return shelf.remove(i);
						
			}
		}
		
		return r;
	}
	
	public ArrayList<GenericItem> getShelf(){
		return shelf;
	}
}
