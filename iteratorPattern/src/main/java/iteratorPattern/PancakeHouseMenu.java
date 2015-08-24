package iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
	private ArrayList<MenuItem> menuItems;
	
	PancakeHouseMenu(){
		menuItems = new ArrayList<MenuItem>();
	}

	private void addItem(String name, String desc, double price) {
		menuItems.add(new MenuItem(name, desc, price));
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {
		return new PencakeHouseIterator(menuItems);
	}
	
	@Override
	public void addTestData() {
		//create some data so we have it for testing
		addItem("Pancakehouse menu pancake1", "pancake1 description", 2.99);
		addItem("Pancakehouse menu pancake2", "pancake2 description", 3.45);
		addItem("Pancakehouse menu pancake3", "pancake3 description", 1.99);
		
	}

}
