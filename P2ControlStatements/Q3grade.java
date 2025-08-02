package P2ControlStatements;
import java.util.Scanner;
public class Q3grade {
//3.grade a student based on marks
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter your marks(100):");
   int marks=sc.nextInt();
   System.out.println("Grade:"+(marks/10));
   sc.close();
	}

}
