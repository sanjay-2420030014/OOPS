package P1OperatorsQuestion;
import java.util.Scanner;
public class Q3studentResult {
	//3.Check if a student passed both theory and practical exams using logical AND.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Theory Marks(50):");
		int theory=sc.nextInt();
		System.out.println("Enter practical Marks(50):");
		int practical=sc.nextInt();
		boolean tp=theory>=35;
		boolean pp=practical>=30;
		if(tp&&pp) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Fail");
		}
		sc.close();

		
	}
}
