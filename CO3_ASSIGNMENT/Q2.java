package CO3_ASSIGNMENT;
import java.util.*;
/*2.	In an HR system, employees have attributes like name, salary, and join date. Implement the Comparable
 *  interface for an Employee class to sort by name naturally. Then, create a custom Comparator to sort by 
 *  salary descending. Write code to sort an ArrayList using both approaches and explain the differences between 
 *  Comparator and Comparable, including when to use each for custom sorting.*/
class Employee implements Comparable<Employee> {
    String name;
    double salary;
    String joinDate;

    Employee(String name, double salary, String joinDate) {
        this.name = name;
        this.salary = salary;
        this.joinDate = joinDate;
    }
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return name + " - $" + salary + " - Joined: " + joinDate;
    }
}

class SalaryDescendingComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.salary, e1.salary); // reverse order
    }
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee("Alice", 50000, "2020-05-10"));
	        employees.add(new Employee("Charlie", 75000, "2019-02-15"));
	        employees.add(new Employee("Bob", 60000, "2021-07-01"));

	        System.out.println("Original List:");
	        employees.forEach(System.out::println);

	        Collections.sort(employees);
	        System.out.println("\nSorted by Name (Natural Order):");
	        employees.forEach(System.out::println);

	        Collections.sort(employees, new SalaryDescendingComparator());
	        System.out.println("\nSorted by Salary (Descending):");
	        employees.forEach(System.out::println);
			
	}

}
