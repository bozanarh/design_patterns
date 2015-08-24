package iteratorPattern;

import java.util.Iterator;
import java.util.List;

public class Waitress {
	private List<Menu> menus;
	
	public List<Menu> getMenus() {
		return menus;
	}
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	Waitress( List<Menu> menus) {
		this.menus = menus;
		
	}
	/**
	 * Iterate through both menus and print them
	 */
	public void printMenu(){
		for( Menu m : menus ){
			Iterator<MenuItem> i = (Iterator<MenuItem>) m.createIterator();
			printMenu(i);
		}
	}
	public void printMenu(Iterator i){
		
		while( i.hasNext() ){
			MenuItem item = (MenuItem)i.next();
			System.out.print("name: " + item.getName());
			System.out.print(", description: " + item.getDesc());
			System.out.println(", price: " + item.getPrice());
		}
	}
}
