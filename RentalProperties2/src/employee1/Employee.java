package employee1;

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
                    EmploymentStatus emplStatus,  double salary) {
        emplNbr = number;
        this.name = name;
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

class CompanyRecords {

    public CompanyRecords() {
    }

    public Employee[] registerEmployees() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee();
        employees[0].setEmployeeNumber(20062);
        employees[0].setEmployeeName("Robert Mathews");
        employees[0].setStatus(EmploymentStatus.FULLTIME);
        employees[0].setHourlySalary(8.65);

        employees[1] = new Employee();
        employees[1].setEmployeeNumber(92741);
        employees[1].setEmployeeName("Helena Orlo");
        employees[1].setStatus(EmploymentStatus.FULLTIME);
        employees[1].setHourlySalary(16.05);

        employees[2] = new Employee();
        employees[2].setEmployeeNumber(81824);
        employees[2].setEmployeeName("Rosette Bitha");
        employees[2].setStatus(EmploymentStatus.PARTTIME);
        employees[2].setHourlySalary(8.65);

        employees[3] = new Employee();
        employees[3].setEmployeeNumber(28024);
        employees[3].setEmployeeName("Julius Nye");
        employees[3].setStatus(EmploymentStatus.UNKNOWN);
        employees[3].setHourlySalary(16.05);

        employees[4] = new Employee();
        employees[4].setEmployeeNumber(19283);
        employees[4].setEmployeeName("Frank Arnolds");
        employees[4].setStatus(EmploymentStatus.FULLTIME);
        employees[4].setHourlySalary(16.05);

	return employees;
    }

    public void showRecords(Employee[] records) {
        System.out.println("Employees Records");
        System.out.println("==========================");

        for (Employee eachOne : records) {
            System.out.printf("Employee #: %d\n", eachOne.getEmployeeNumber());
            System.out.printf("Full Name:  %s\n", eachOne.getEmployeeName());
            System.out.printf("Status:     %s\n", eachOne.getStatus());
            System.out.printf("Hourly Wage %.2f\n", eachOne.getHourlySalary());
            System.out.println("---------------------------");
        }
    }
}
