package P1OperatorsQuestion;
import java.util.Scanner;
public class Q7ternaryoperator {
// Find the greater of two numbers using a ternary operator.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a= sc.nextInt();
		int b=sc.nextInt();
		int g=(a>b)?a:b;
		System.out.println("Greatest number is:"+g);
		sc.close();

	}

}
