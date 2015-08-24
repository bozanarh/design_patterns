package iteratorPattern;

import java.util.ArrayList;



public class Main {

	public static void main(String[] args) {
		ArrayList<Menu> menus = new ArrayList<Menu>();

		Menu pancakeHouseMenu = new PancakeHouseMenu();
		pancakeHouseMenu.addTestData();
		menus.add(pancakeHouseMenu);

		Menu dinerMenu = new DinerMenu();
		dinerMenu.addTestData();
		menus.add(dinerMenu);

		Waitress w = new Waitress(menus);
		w.printMenu();
	}

}
