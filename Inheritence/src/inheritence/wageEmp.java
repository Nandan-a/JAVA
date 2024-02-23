package inheritence;

public class wageEmp extends emp{
	
	private int hrs,rate;

	 public wageEmp(){}
	public wageEmp(int empid, String empname, int hrs, int rate) {
		super(empid, empname);
		this.hrs = hrs;
		this.rate = rate;
	}
	
	
	public int calcSalary() {
		return this.hrs * this.rate;
	}

	public static void main(String[] args) {
		wageEmp we1 = new wageEmp(1001,"Nandan",10,1000);
		we1.displayEmp();
		System.out.println("sal is : "+ we1.calcSalary());
	}
	
}
