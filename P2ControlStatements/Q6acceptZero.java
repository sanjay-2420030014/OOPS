package P2ControlStatements;
import java.util.Scanner;
public class Q6acceptZero {
//6. Accept numbers until user enters 0.
	public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    do {
    	System.out.println("Enter number:");
    	n=sc.nextInt();
    }while(n!=0);
    System.out.println("Thank You");
    sc.close();
	}

}
