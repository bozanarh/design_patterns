package iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PencakeHouseIterator implements Iterator<MenuItem> {
	private ArrayList<MenuItem> menuItems;
	private int position = 0;
	
	PencakeHouseIterator(ArrayList items){
		this.menuItems = items;
	}
	public boolean hasNext() {
		if(position >= menuItems.size() || menuItems.get(position) == null){
			return false;
		}else{
			return true;
		}
	}

	public MenuItem next() {
		MenuItem mi = menuItems.get(position);
		position++;
		return mi;
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
