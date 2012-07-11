package companyrecords;

class CompanyRecords {

    public CompanyRecords(Employee[] employees) {
        employees = new Employee[4];

        employees[0] = new Employee();
        employees[0].setEmployeeNumber(70128);
        employees[0].setEmployeeName("Frank Dennison");
        employees[0].setStatus(EmploymentStatus.PARTTIME);
        employees[0].setHourlySalary(8.65);

        employees[1] = new Employee();
        employees[1].setEmployeeNumber(24835);
        employees[1].setEmployeeName("Jeffrey Arndt");
        employees[1].setStatus(EmploymentStatus.UNKNOWN);
        employees[1].setHourlySalary(16.05);

        employees[2] = new Employee();
        employees[2].setEmployeeNumber(92735);
        employees[2].setEmployeeName("Nathan Sanitrah");
        employees[2].setStatus(EmploymentStatus.FULLTIME);
        employees[2].setHourlySalary(8.65);

        employees[3] = new Employee();
        employees[3].setEmployeeNumber(29385);
        employees[3].setEmployeeName("Olivia Hathay");
        employees[3].setStatus(EmploymentStatus.FULLTIME);
        employees[3].setHourlySalary(16.05);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Employee[] values = new Employee[4];
	CompanyRecords Records = new CompanyRecords(values);
    }
}