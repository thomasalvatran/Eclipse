//http://www.javatutorialhub.com/java-arrays.html
import java.util.*;

class CarPart{
	long     PartNumber;
	String   PartName;
	double    UnitPrice;
	CarPart(int i, String s, double j){
	  PartNumber = i;
	  PartName = s;
	  UnitPrice = j;
	}
   public String toString() {
   		return PartNumber + " " + PartName + " " + UnitPrice;
    }
	public void showPart(){
	   System.out.println("Value of PartNumber ="+ PartNumber);
	   System.out.println("Value of PartName ="+ PartName);
 }
}

class Parts{
   public static void main(String args[]){
     LinkedList<CarPart> parts = new LinkedList<CarPart>();
     parts.add(new CarPart(9743,"Air Filter",8.75));
     parts.add(new CarPart(27487,"Clutch Disk",47.15));
     parts.add(new CarPart(87873,"Brake Disk",35.15));
     parts.add(new CarPart(27644,"A/C Filter Drier",55.55));
     for (CarPart element : parts) 
       System.out.println(element + "\n");
     parts.remove(0); 
     System.out.println("--After remove first part from LinkedList---"); 
     for (CarPart element : parts) 
       System.out.println(element + "\n");
     parts.removeLast();
     System.out.println("---After remove last part from LinkedList---"); 
      for (CarPart element : parts) 
       System.out.println(element + "\n");
  }
}
