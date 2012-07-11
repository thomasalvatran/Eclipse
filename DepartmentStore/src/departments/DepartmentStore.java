package departments;
class DepartmentStore1 {
    long itemNumber;
    char category;
    String itemName;
    double unitPrice;
}
public class DepartmentStore {
	public static void main(String[] args) {
        DepartmentStore1 dptStore = new DepartmentStore1();

        dptStore.itemNumber = 437876;
        dptStore.category = 'W';
        dptStore.itemName = "Scoop Neck Dress";
        dptStore.unitPrice = 148.00D;

        System.out.println("Department Store");
        System.out.println("Stock #:    " + dptStore.itemNumber);
        System.out.println("Category:   " + dptStore.category);
        System.out.println("Name:       " + dptStore.itemName);
        System.out.println("Unit Price: " + dptStore.unitPrice);
    }
}
