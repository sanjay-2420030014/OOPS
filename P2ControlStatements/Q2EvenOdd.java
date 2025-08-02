package P2ControlStatements;
import java.util.Scanner;
public class Q2EvenOdd {
//2 . check if a number is even / odd
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");			
		}
		sc.close();
	}
}
