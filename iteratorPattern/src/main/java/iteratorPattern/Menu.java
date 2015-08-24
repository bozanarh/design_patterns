package iteratorPattern;

import java.util.Iterator;

public interface Menu {
	Iterator<MenuItem> createIterator();
	
	void addTestData();
}
