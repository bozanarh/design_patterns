package iteratorPattern;

import java.util.Iterator;

public class DinerMenu implements Menu{
	private MenuItem[] menuItems;
	static final int MAX_NUM_ITEMS = 10;
	
	public DinerMenu(){
		menuItems = new MenuItem[MAX_NUM_ITEMS];
		menuItems[0] = new MenuItem("Diner menu item1", "Desc for item1", 3.90);
		menuItems[1] = new MenuItem("Diner menu item2", "Desc for item2", 1.90);
		
	}
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
	}

	
}
