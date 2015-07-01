package iteratorPattern;

public class Main {

	public static void main(String[] args) {
		PencakeHouseMenu pHM = new PencakeHouseMenu();
		DinerMenu dM = new DinerMenu();
		
		Waitress w = new Waitress(pHM, dM);
		w.printMenu();
	}

}
