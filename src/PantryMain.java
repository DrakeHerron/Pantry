import java.util.ArrayList;


public class PantryMain {
	public static void main(String[] args) {
		
		
		GenericItem genI = new GenericItem();
		//System.out.println(genI);
		
		NewItemOil itemOil = new NewItemOil("Canola", 10, "Canola Oil");
		NewItemCereal itemCer = new NewItemCereal();
		
		Shelf topShelf = new Shelf();
		Shelf bottemShelf = new Shelf();
		
		ArrayList<Shelf> pantry = new ArrayList<Shelf>();
		pantry.add(topShelf);
		pantry.add(bottemShelf);		
		
		topShelf.place(itemOil);
		topShelf.place(itemCer);
		topShelf.place(new NewItemFlour());
		topShelf.place(new NewItemOil("Olive oil", 5, ""));
		
		ArrayList<GenericItem> t = topShelf.getShelf();
		System.out.println(t.size());
		
		for(int i = 0; i < t.size(); i++) {
			GenericItem tempItem = t.get(i);
			System.out.println(tempItem.getType());
			if(tempItem.getType().equals("oil")) {
				NewItemOil o = (NewItemOil)tempItem;
				System.out.println(o.getSmokePoint());
			} else if (tempItem.getType().equals("cereal")) {
				NewItemCereal c = (NewItemCereal)tempItem;
				System.out.println(c.hasPrize());
			}
		}
		
		/*		
		//Created a shelf for Oil Objects
		ShelfOil oilShelf = new ShelfOil(300);
		System.out.println(oilShelf.toString());
		boolean placed = oilShelf.place(new ItemOil());
		System.out.println(oilShelf.toString());
		System.out.println(placed);
		ItemOil o = oilShelf.remove("generic");
		o.pour(12);
		oilShelf.place(o);
		System.out.println(oilShelf.toString());
		
		
	
		ArrayList<String> itemNames = new ArrayList<String>(10);
		ArrayList<Integer> itemQty = new ArrayList<Integer>();
		
		//add individual objects to the ArrayList
		itemQty.add(2);
		itemQty.add(5);
		itemQty.add(1);
		
		//access all individual objects
		for(int i = 0; i < itemQty.size(); i++) {
			//.get(int index) -- returns the object at the given index...
			System.out.println(itemQty.get(i));
		}
		
		
		System.out.println(itemQty.contains(4));
		
		System.out.println(itemQty.indexOf(5));
		System.out.println(itemQty.indexOf(0));
		
		int el = itemQty.remove(2);
		
		System.out.println(el);
		
		for(int i = 0; i < itemQty.size(); i++) {
			//.get(int index) -- returns the object at the given index...
			System.out.println(itemQty.get(i));
		}
		
		
		itemQty.set(0, null);
		
		System.out.println(itemQty.get(0) == 2);
		System.out.println(itemNames.toString());
	
	
		ItemOil[] shelfOil = new ItemOil[3];
		
		shelfOil[0] = new ItemOil();
		shelfOil[1] = new ItemOil("Olive Oil", 12.5);
		shelfOil[2] = new ItemOil("Vegetable Oil", 13);
		//ItemOil oil = new ItemOil();  //qty = 12 type = generic exp=...
		//ItemOil oliveOil = new ItemOil("Olive Oil", 12.5);
		//ItemOil vegOil  = new ItemOil("Vegetable Oil", 13);

		//print the toString for each item on the shelf...
		for(int i = 0; i < shelfOil.length; i++) {
			System.out.println("---------");
			System.out.println(shelfOil[i].toString());
		}
		
		System.out.println("---------");
		System.out.println(shelfOil[1].type);
		shelfOil[1].type = "GENERIC";
		System.out.println(shelfOil[1].type);
		System.out.println("---------");
		
		
		
		
		
		//Store all together... LIST!!!!.... Array
		ItemFlour[] shelfFlour = new ItemFlour[3];
		shelfFlour[0] = new ItemFlour();
		shelfFlour[1] = new ItemFlour("Rice Flour", 10.5, true);
		shelfFlour[2] = new ItemFlour("Self-Rising", 12);
		
		//print the toString for each item on the shelf...
		for(int i = 0; i < shelfFlour.length; i++) {
			System.out.println("---------");
			System.out.println(shelfFlour[i].toString());
		}
		
		ItemCereal[] shelfCereal = new ItemCereal[3];
		
		
		shelfCereal[0]  = new ItemCereal("kix", 12, false);
		shelfCereal[1]  = new ItemCereal();
		shelfCereal[2]  = new ItemCereal("Reese's Puffs", 10, false);
		
		//print the toString for each item on the shelf...
		for(int i = 0; i < shelfCereal.length; i++) {
			System.out.println("---------");
			System.out.println(shelfCereal[i].toString());
		}
		
		
	//	shelfCereal[0] = new ItemFlour();
		
		int[] val = new int[2];
		val[0] = 12;
		val[1] = 5;
		//val[2] = 3;
		/*pour 5 out of the container
		String response = oil.pour(5.0); //qty = 7 type = generic exp =...
		System.out.println(response);
		response = oil.pour(10);
		System.out.println(response);
		System.out.println(oil.toString());
		response = oil.addQty(10); //qty = 17
		System.out.println(response);
		System.out.println(oil.toString());
		response = oil.addQty(5); // qty = 20 
		System.out.println(response);
		System.out.println(oil.toString());
		*/

		

		
	}
}
