package employee1;

public class Main {
    public static void main(String[] args) throws Exception {
        CompanyRecords people = new CompanyRecords();

        Employee[] contractors = people.registerEmployees();
        people.showRecords(contractors);
    }
}