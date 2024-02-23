package day_02;

public class Emp {
	 static int eid;
	String empName;
	double sal;
	static int counter=0;
	
	public Emp(){
		this.eid = ++counter;
		this.empName = "Unknown";
	}

	

	public Emp(String empName) {
		this.eid = ++counter;
		this.empName = empName;
	}


	public Emp(String empName,double sal) {
		this.eid = ++counter;
		this.empName = empName;
		this.sal = sal;
	}


	public String toString() {
		return "Emp [empName=" + empName + ", sal=" + sal + "]";
	}
	
	
	public static void main(String[] args) {
		Emp e1= new Emp();
		Emp e2= new Emp("Nandan");
		Emp e3= new Emp("Madhu",34000);
	}
	

	

}
