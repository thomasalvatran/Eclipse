package Employee;


public class Main {
	public static void main(String[] args) throws Exception {
		Employee[] staffMembers = new Employee[3];
		staffMembers[0] = new Employee();
        staffMembers[0].setEmployeeNumber(20204);
        staffMembers[0].setEmployeeName("Harry Fields");
        staffMembers[0].setStatus(EmploymentStatus.FULLTIME);
        staffMembers[0].setHourlySalary(16.85);

        staffMembers[1] = new Employee();
        staffMembers[1].setEmployeeNumber(92857);
        staffMembers[1].setEmployeeName("Jennifer Almonds");
        staffMembers[1].setStatus(EmploymentStatus.FULLTIME);
        staffMembers[1].setHourlySalary(22.25);

        staffMembers[2] = new Employee();
        staffMembers[2].setEmployeeNumber(42963);
        staffMembers[2].setEmployeeName("Sharon Culbritt");
        staffMembers[2].setStatus(EmploymentStatus.PARTTIME);
        staffMembers[2].setHourlySalary(10.95);
        
        for (int i = 0; i < 3; i++){
	        System.out.println("Employee Record " + i);
	        System.out.println("---------------------------");
	        System.out.println("Employee #: " + staffMembers[i].getEmployeeNumber());
	        System.out.println("Full Name:  " + staffMembers[i].getEmployeeName());
	        System.out.println("Status:     " + staffMembers[i].getStatus());
	        System.out.println("Salary:     " + staffMembers[i].getHourlySalary());
	        System.out.println("---------------------------");
        	}
	    }

}
//Employee[] staffMembers = new Employee[] {
//        new Employee(20204, "Harry Fields",
//                     EmploymentStatus.FULLTIME,
//                     16.85),
//
//        new Employee(92857, "Jennifer Almonds",
//                     EmploymentStatus.FULLTIME,
//                     22.25),
//
//        new Employee(42963, "Sharon Culbritt",
//                     EmploymentStatus.PARTTIME,
//                     10.95)
//};