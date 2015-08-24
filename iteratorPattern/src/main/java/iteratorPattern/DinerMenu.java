package iteratorPattern;

import java.util.Iterator;

public class DinerMenu implements Menu{
	
	private MenuItem[] menuItems;
	static final int MAX_NUM_ITEMS = 10;
	
	public DinerMenu(){
		menuItems = new MenuItem[MAX_NUM_ITEMS];
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
	}
	
	@Override
	public void addTestData(){
		//create some data so we have it for testing
		menuItems[0] = new MenuItem("Diner menu item1", "Description of item1", 3.90);
		menuItems[1] = new MenuItem("Diner menu item2", "Description of item2", 1.90);
		menuItems[2] = new MenuItem("Diner menu item3", "Description of item3", 4.20);
	}
}
