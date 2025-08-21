package P8ClassAndObject;
/* Create a class Employee with data members id, name, and salary.
 * In the constructor, use parameter names same as instance variable names and resolve ambiguity using the this keyword. 
 * Display employee details.*/
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;        
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class Q4EmployeeDetails {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Employee ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Enter Employee Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Salary: ");
	        double salary = sc.nextDouble();

	        Employee emp = new Employee(id, name, salary);

	        System.out.println("\n--- Employee Details ---");
	        emp.display();

	        sc.close();
	}

}
