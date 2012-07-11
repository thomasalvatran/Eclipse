package rentalproperties4;

public class Main {
    private static RentalProperty[] createProperties() {
        RentalProperty[] records = new RentalProperty[8];

        records[0] = new RentalProperty();
        records[0].setPropertyNumber(192873);
        records[0].setPropertyType(PropertyType.SINGLEFAMILY);
        records[0].setBedrooms(5);
        records[0].setBathrooms(3.50F);
        records[0].setMonthlyRent(2250.00D);

        records[1] = new RentalProperty();
        records[1].setPropertyNumber(498730);
        records[1].setPropertyType(PropertyType.SINGLEFAMILY);
        records[1].setBedrooms(4);
        records[1].setBathrooms(2.50F);
        records[1].setMonthlyRent(1885.00D);
    
        records[2] = new RentalProperty();
        records[2].setPropertyNumber(218502);
        records[2].setPropertyType(PropertyType.APARTMENT);
        records[2].setBedrooms(2);
        records[2].setBathrooms(1.00F);
        records[2].setMonthlyRent(1175.50D);

        records[3] = new RentalProperty();
        records[3].setPropertyNumber(612739);
        records[3].setPropertyType(PropertyType.APARTMENT);
        records[3].setBedrooms(1);
        records[3].setBathrooms(1.00F);
        records[3].setMonthlyRent(945.00D);
    
        records[4] = new RentalProperty();
        records[4].setPropertyNumber(457834);
        records[4].setPropertyType(PropertyType.TOWNHOUSE);
        records[4].setBedrooms(3);
        records[4].setBathrooms(2.50F);
        records[4].setMonthlyRent(1750.50D);
        
        records[5] = new RentalProperty();
        records[5].setPropertyNumber(927439);
        records[5].setPropertyType(PropertyType.APARTMENT);
        records[5].setBedrooms(1);
        records[5].setBathrooms(1.00F);
        records[5].setMonthlyRent(1100.00D);

        records[6] = new RentalProperty();
        records[6].setPropertyNumber(570520);
        records[6].setPropertyType(PropertyType.APARTMENT);
        records[6].setBedrooms(3);
        records[6].setBathrooms(2.00F);
        records[6].setMonthlyRent(1245.95D);
    
        records[7] = new RentalProperty();
        records[7].setPropertyNumber(734059);
        records[7].setPropertyType(PropertyType.TOWNHOUSE);
        records[7].setBedrooms(4);
        records[7].setBathrooms(1.50F);
        records[7].setMonthlyRent(1950.25D);
        
        return records;
    }
    
    private static void showProperties(RentalProperty[] props) {
        System.out.println("Properties Listing");
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
        RentalProperty[] properties = createProperties();

        showProperties(properties);
    }        
}