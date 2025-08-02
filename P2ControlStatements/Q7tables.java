package P2ControlStatements;
import java.util.Scanner;
public class Q7tables {
// 7. Print the multiplication table for a given number.
	public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter number:");
    int n=sc.nextInt();
    for(int i=1;i<=10;i++) {
    	System.out.println(n+"x"+i+"="+(n*i));
    }
    sc.close();
	}

}
