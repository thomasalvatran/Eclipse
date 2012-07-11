package rentalproperties4;

enum PropertyType {
    SINGLEFAMILY,
    TOWNHOUSE,
    APARTMENT,
    UNKNOWN
}

public class RentalProperty {
    private long nbr;
    private PropertyType tp;
    private int bd;
    private float bt;
    private double rnt;

    public RentalProperty() {
        nbr = 0;
        tp = PropertyType.UNKNOWN;
        bd = 0;
        bt = 0.0F;
        rnt = 0D;
    }

    public RentalProperty(long propNbr, PropertyType type,
                          int beds, float baths, double rent) {
        nbr = propNbr;
        tp = type;
        bd = beds;
        bt = baths;
        rnt = rent;
    }
    
    public long getPropertyNumber() {
        return nbr;
    }
       
    public void setPropertyNumber(long propNumber) {
        nbr = propNumber;
    }
       
    public PropertyType getPropertyType() {
        return tp;
    }
       
    public void setPropertyType(PropertyType propType) {
        tp = propType;
    }

    public int getBedrooms() {
        return bd;
    }
       
    public void setBedrooms(int beds) {
        bd = beds;
    }
    
    public float getBathrooms() {
        return bt;
    }
       
    public void setBathrooms(float baths) {
        bt = baths;
    }

    public double getMonthlyRent() {
            return rnt;
    }
       
    public void setMonthlyRent(double value) {
        rnt = value;
    }
}