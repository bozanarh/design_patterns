package iteratorPattern;

import java.util.Iterator;

public class Waitress {
	private PencakeHouseMenu pHM;
	private DinerMenu dM;
	
	Waitress( PencakeHouseMenu pHM, DinerMenu dM){
		this.pHM = pHM;
		this.dM = dM;
	}
	public void printMenu(){
		Iterator<MenuItem> i = (Iterator<MenuItem>) pHM.createIterator();
		printMenu(i);
		i = (Iterator<MenuItem>) dM.createIterator();
		printMenu(i);
	}
	public void printMenu(Iterator i){
		
		while( i.hasNext() ){
			MenuItem item = (MenuItem)i.next();
			System.out.print("name: " + item.getName());
			System.out.println("desc: " + item.getDesc());
			System.out.println("price: " + item.getPrice());
		}
	}
}
