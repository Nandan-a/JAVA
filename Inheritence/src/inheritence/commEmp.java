package inheritence;

public class commEmp extends wageEmp{
	private int commision;

	public commEmp(int empid, String empname, int hrs, int rate, int commision) {
		super(empid, empname, hrs, rate);
		this.commision = commision;
	}
	
	public int Comm() {
		return super.calcSalary() + commision;
	}
	
	

	public static void main(String[] args) {
		commEmp ce1 = new commEmp(1001,"Nandan",10,1000,1200);
		//ce1.calcSalary();
		System.out.println("sal is : "+ ce1.Comm());
	}
	
}
