package CO2_ASSIGNMENT;
/*2.	Develop a class hierarchy with Employee as the superclass and Manager, Developer, and Intern as subclasses.
 *  Each subclass overrides the calculateSalary() method. 
 *  Store instances of these subclasses in an array of Employee references and invoke calculateSalary() on each.
 *  Explain how runtime polymorphism operates in this context.
 * */
class Employee {
    double salary;
    Employee(double salary) {
        this.salary = salary;
    }
    double calculateSalary() {
        return salary;
    }
}

class Manager extends Employee {
    Manager(double salary) {
        super(salary);
    }
    double calculateSalary() {
        return salary + 10000; 
    }
}

class Developer extends Employee {
    Developer(double salary) {
        super(salary);
    }
    double calculateSalary() {
        return salary + 5000; 
    }
}

class Intern extends Employee {
    Intern(double salary) {
        super(salary);
    }
    double calculateSalary() {
        return salary; 
    }
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Employee[] employees = {
	            new Manager(40000),
	            new Developer(30000),
	            new Intern(10000)
	        };

	        for (Employee e : employees) {
	            System.out.println("Final Salary: ₹" + e.calculateSalary());
	        }
	}

}
