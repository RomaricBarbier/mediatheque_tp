package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.print();
	}


	public void printOnlyBooks() {

		BookPrinter bp = new BookPrinter() ;
		for (Item i : items) { i.valide(bp);}

	}


	public void printOnlyCDs() {

		CDPrinter cdp = new CDPrinter();
			for (Item i : items) { i.valide(cdp);}

	}
}
