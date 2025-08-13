package CO1_ASSIGNMENT;
import java.util.Scanner;
public class Q4 {
/*Q4. Write a program that takes an integer and checks If it’s prime and less than 100 and it’s not divisible by 2 or 5.
 *  Use logical operators to combine conditions.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n<100) {
			System.out.println("Number is less than 100");
		}
		else {
			System.out.println("Number is Greater than 100");
		}
		if(n%2!=0 || n%5!=0) {
			System.out.println("Number is not divisible by 2 or 5");
		}
		else {
			System.out.println("Number is divisible by both 2 and 5");
		}
		boolean prime=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				prime = false;
			}
		}
		System.out.println("Prime Number:"+prime);
		sc.close();
	}

}
