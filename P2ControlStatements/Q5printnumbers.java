package P2ControlStatements;
import java.util.Scanner;
public class Q5printnumbers {
//5. Print numbers from 1 to N.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		sc.close();
	}

}
