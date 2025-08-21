package P8ClassAndObject;

import java.util.Scanner;
/*Create a class Student with attributes rollNo, name, and marks.
 * Aaccept details from the user. Create multiple student objects and print their details.*/
class Student {
    int rollNo;
    String name;
    float marks;

    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}

public class Q1ClassStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Marks: ");
            float marks = sc.nextFloat();

            students[i] = new Student(rollNo, name, marks);
        }

        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.display();
        }

        sc.close();

	}

}
