package OperatorsQuestion;
import java.util.Scanner;
public class Q4bitwise {
//Demonstrate bitwise AND, OR, XOR, and complement operators on two numbers
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b= sc.nextInt();
		System.out.println("Bitwise AND &:"+(a&b));
		System.out.println("Bitwise OR |:"+(a|b));
		System.out.println("Bitwise XOR ^:"+(a^b));
		System.out.println("Bitwise Complement ~a:"+(~a)+"\n~b:"+(~b));
		sc.close();

	}
}
