package companyrecords;

enum EmploymentStatus {
    FULLTIME,
    PARTTIME,
    UNKNOWN
};

class Employee {
    private long emplNbr;
    private String name;
    private EmploymentStatus st;
    private double wage;

    public Employee() {
    }

    public Employee(long number, String name,
                    EmploymentStatus emplStatus,
		    double salary) {
        emplNbr = number;
        name = name;
        st = emplStatus;
        wage = salary;
    }
    
    public long getEmployeeNumber() {
	return emplNbr;
    }
   
    public void setEmployeeNumber(long value) {
	emplNbr = value; 
    }

    public String getEmployeeName() {
	return name;
    }
    
    public void setEmployeeName(String value) {
	name = value; 
    }

    public EmploymentStatus getStatus() {
	return st;
    }

    public void setStatus(EmploymentStatus value) {
	st = value;
    }

    public double getHourlySalary() {
	return wage;
    }

    public void setHourlySalary(double value) {
	wage = value;
    }
}