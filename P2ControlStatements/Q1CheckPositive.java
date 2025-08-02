package P2ControlStatements;
import java.util.Scanner;
public class Q1CheckPositive {
   // 1. Check if a number is positive.
	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a integer");
    int n=sc.nextInt();
    if(n>0) {
    	System.out.println("Number is positive");
    }
    else if(n<0) {
    	System.out.println("Number is negative");
    }
    else if(n==0) {
    	System.out.println("Number is ZERO");
    }
    sc.close();
	}

}
