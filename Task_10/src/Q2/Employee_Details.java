package Q2;

public class Employee_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1024, "Kamal", 50000);
				
		//10% Percent Increment in Salary for Employee kamal
		emp.Raisesalary(10);
		
		System.out.println("Salary Updated Employee Info:");
        displayEmployeeInfo(emp);
	}		
		public static void displayEmployeeInfo(Employee emp) {
	        System.out.println("Employee ID: " + emp.getEmpid());
	        System.out.println("Employee Name: " + emp.getEmpName());
	        System.out.println("Employee Salary: $" + emp.getEmpSalary());
	}

}
