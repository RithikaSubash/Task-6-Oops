package javaoops;

public class Main2 {
	public static void main(String[] args) {
   
        Employee emp = new Employee(1, "Jane", "Doe", 5000);

        System.out.println(emp.toString());

        System.out.println("Annual Salary: " + emp.getAnnualSalary());

        emp.raiseSalary(10);
        System.out.println("New Salary after 10% raise: " + emp.getSalary());

        System.out.println(emp.toString());
    }
}


