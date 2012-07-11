package rentalproperties3;
//import rentalproperties2.RentalProperty;

public class Main {
    private static void showProperties(RentalProperty[] props) {
        System.out.println("properties Listing");
        System.out.println("=============================================");
        System.out.println("Prop #  Property Type  Beds Baths Monthly Rent");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < props.length; i++) {
            System.out.printf("%d\t%s\t%d   %.2f   %.2f\n",
                              props[i].getPropertyNumber(),
                              props[i].getPropertyType(),
                              props[i].getBedrooms(),
                              props[i].getBathrooms(),
                              props[i].getMonthlyRent());   
        }
        System.out.println("=============================================");    
    }
        
    public static void main(String[] args) throws Exception {
        RentalProperty[] properties = new RentalProperty[8];

        properties[0] = new RentalProperty();
        properties[0].setPropertyNumber(192873);
        properties[0].setPropertyType(PropertyType.SINGLEFAMILY);
        properties[0].setBedrooms(5);
        properties[0].setBathrooms(3.50F);
        properties[0].setMonthlyRent(2250.00D);

        properties[1] = new RentalProperty();
        properties[1].setPropertyNumber(498730);
        properties[1].setPropertyType(PropertyType.SINGLEFAMILY);
        properties[1].setBedrooms(4);
        properties[1].setBathrooms(2.50F);
        properties[1].setMonthlyRent(1885.00D);
    
        properties[2] = new RentalProperty();
        properties[2].setPropertyNumber(218502);
        properties[2].setPropertyType(PropertyType.SINGLEFAMILY);
        properties[2].setBedrooms(2);
        properties[2].setBathrooms(1.00F);
        properties[2].setMonthlyRent(1175.50D);

        properties[3] = new RentalProperty();
        properties[3].setPropertyNumber(612739);
        properties[3].setPropertyType(PropertyType.APARTMENT);
        properties[3].setBedrooms(1);
        properties[3].setBathrooms(1.00F);
        properties[3].setMonthlyRent(945.00D);
    
        properties[4] = new RentalProperty();
        properties[4].setPropertyNumber(457834);
        properties[4].setPropertyType(PropertyType.TOWNHOUSE);
        properties[4].setBedrooms(3);
        properties[4].setBathrooms(2.50F);
        properties[4].setMonthlyRent(1750.50D);
        
        properties[5] = new RentalProperty();
        properties[5].setPropertyNumber(927439);
        properties[5].setPropertyType(PropertyType.APARTMENT);
        properties[5].setBedrooms(1);
        properties[5].setBathrooms(1.00F);
        properties[5].setMonthlyRent(1100.00D);

        properties[6] = new RentalProperty();
        properties[6].setPropertyNumber(570520);
        properties[6].setPropertyType(PropertyType.APARTMENT);
        properties[6].setBedrooms(3);
        properties[6].setBathrooms(2.00F);
        properties[6].setMonthlyRent(1245.95D);
    
        properties[7] = new RentalProperty();
        properties[7].setPropertyNumber(734059);
        properties[7].setPropertyType(PropertyType.TOWNHOUSE);
        properties[7].setBedrooms(4);
        properties[7].setBathrooms(1.50F);
        properties[7].setMonthlyRent(1950.25D);

        showProperties(properties);
    }        
}