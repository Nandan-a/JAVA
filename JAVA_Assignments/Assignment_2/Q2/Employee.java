package Q4.Q1.Q2;
public class Employee {
    String name;
    int id,salary;

    String Employee_name(String USER_Employee){
        this.name=USER_Employee;
        return this.name;
    }
    int Employee_id(int USER_id){
        this.id=USER_id;
        return this.id;
    }
    int Employee_salary(int USER_salary){
        this.salary=USER_salary;
        return this.salary;
    }


    public static void main(String[] args) {
        Employee e1=new Employee();
        System.out.printf("Employee ID is %d\n", e1.Employee_id(2));
        System.out.printf("Name of the Employee is %s\n", e1.Employee_name("Aniket"));
        System.out.printf("Employee earns %d per annum.\n", e1.Employee_salary(200000));


    }
}
