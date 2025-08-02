package P4Arrays;
import java.util.Scanner;
public class Q2ReadPrint {

	public static void main(String[] args) {
  //2. program to read elements and print them on console
		Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5]; 

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
	}

}
