package inheritence;

//public class emp() {}

public class emp {
 int empid;
 String empname;
 
 public emp(){}
public emp(int empid, String empname) {

	this.empid = empid;
	this.empname = empname;
}




public void displayEmp() {
	System.out.println( "emp [empid=" + empid + ", empname=" + empname + "]");	
}
 
}


