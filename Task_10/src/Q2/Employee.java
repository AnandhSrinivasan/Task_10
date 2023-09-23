package Q2;

   //Attribute
   public class Employee {
    	int Empid ;
    	String EmpName ;
    	double EmpSalary ;
    //Constructor
    public Employee (int Empid, String EmpName, double EmpSalary) {
    	this.Empid= Empid;
    	this.EmpName= EmpName;
        this.EmpSalary= EmpSalary;
    }
    //Getter and Setter Method
    public int getEmpid() {
		return Empid;
	}
    public void setEmpid(int empid) {
		Empid = empid;
	}
    
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	
	public double getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(double empSalary) {
		EmpSalary = empSalary;
	}


   public void Raisesalary (double percent) {
	   if (percent>0) {
		double RaiseAmnt = EmpSalary * (percent/100.00);
		EmpSalary += RaiseAmnt;
		System.out.println("Employee ID is " + Empid +", Name is " + EmpName + " and Salary Raised by " 
		+ percent +"% and New Salary is "+ EmpSalary);
	} else {
		System.out.println("Salary Not raised.");
	}
   } 
 }