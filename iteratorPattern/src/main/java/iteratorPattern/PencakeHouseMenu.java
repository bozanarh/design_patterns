package iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PencakeHouseMenu implements Menu {
	private ArrayList<MenuItem> menuItems;
	
	PencakeHouseMenu(){
		menuItems = new ArrayList<MenuItem>();
		addItem("pancake1", "pencake1 desc", 2.99);
		addItem("pancake2", "pancake2 desc", 3.45);
		addItem("pancake3", "panncake3 desc", 1.99);
	}
	private void addItem(String name, String desc, double price) {
		menuItems.add(new MenuItem(name, desc, price));
	}
	public Iterator<MenuItem> createIterator() {
		return new PencakeHouseIterator(menuItems);
	}

}
