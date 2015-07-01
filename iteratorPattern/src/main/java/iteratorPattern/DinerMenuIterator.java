package iteratorPattern;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
	private int current;
	private MenuItem[] menuItems;
	
	public DinerMenuIterator(MenuItem[] menuItems ){
		this.menuItems = menuItems;
		current = 0;
	}
	public boolean hasNext() {
		if( current <= menuItems.length && menuItems[current] != null ) return true;
		else return false;
	}

	public MenuItem next() {
		return menuItems[current++];
	}

	public void remove() {
		// TODO Auto-generated method stub

	}

}
