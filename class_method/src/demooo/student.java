package demooo;

public class student {
  private int sid;
 private String Sname,course;
 private char grade;
 
 
public student(int sid, String sname, String course, char grade) {
	
	this.sid = sid;
	this.Sname = sname;
	this.course = course;
	this.grade = grade;
}


public String toString() {
	return "student [sid=" + sid + ", Sname=" + Sname + ", course=" + course + ", Grade=" + grade + "]";
}
 

public static void main(String[] args) {
	student s1 = new student(1001,"Nandan","DIoT",'A');
	System.out.println(s1);
}
 
}
