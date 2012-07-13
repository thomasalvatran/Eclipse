//package org.cadenhead.ecommerce;  you have to create dir org/cadenheard/ecommerce see how slickedit does with this one

//import org.cadenhead.ecommerce.*;
public class GiftShop {
	public static void main(String[] arguments) {
	StoreFront store = new StoreFront();
	store.addItem("C01", "MUG", "9.99", "150");
	store.addItem("C02", "LG MUG", "12.99", "82");
	store.addItem("C03", "MOUSEPAD", "10.49", "800");
	store.addItem("D01", "T SHIRT", "16.99", "90");
	store.sort();
	for (int i = 0; i < store.getSize(); i++) {
	Item show = (Item)store.getItem(i);
	System.out.println("\nItem ID: " + show.getId() + "\nName: " + show.getName() + "\nRetail Price: $" + show.getRetail() +
	"\nPrice: $" + show.getPrice() +
	"\nQuantity: " + show.getQuantity());
	}
	}
}
