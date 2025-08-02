package P1OperatorsQuestion;
import java.util.Scanner;
public class Q1basicOperators {
	//1. Perform addition, subtraction, multiplication, division, and modulus of two numbers
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter 2 integers to perform addition, subtraction, multiplication, division, and modulus:");
    	int a = sc.nextInt();
    	int b=sc.nextInt();
    	System.out.println(a+"+"+b+"="+(a+b));
    	System.out.println(a+"-"+b+"="+(a-b));
    	System.out.println(a+"x"+b+"="+(a*b));
    	System.out.println(a+"/"+b+"="+(a/b));
    	System.out.println(a+"%"+b+"="+(a%b));
    	sc.close();

    }
}
